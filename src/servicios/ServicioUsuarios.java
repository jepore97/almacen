/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Modelos.Usuario;
import almacen.JFrameFormularioUsuario;
import com.devazt.networking.HttpClient;
import com.devazt.networking.OnHttpRequestComplete;
import com.devazt.networking.Response;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Scanner;
import java.net.URI;
import java.net.HttpURLConnection;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author H-P
 */
public class ServicioUsuarios {

    ArrayList<Usuario> usuarios;

    public ArrayList<Usuario> getUsuarios() {
        try {
            usuarios = new ArrayList<Usuario>();
            HttpClient client = new HttpClient(new OnHttpRequestComplete() {
                @Override
                public void onComplete(Response status) {
                    if (status.isSuccess()) {

                        try {
                            JSONArray jsonUsuarios = new JSONArray(status.getResult());
                            usuarios = Usuario.fromJson(jsonUsuarios);
                            

                        } catch (Exception e) {
                        }

                    }
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

            });
            client.excecute("http://192.168.216.2:5000/api/user");
        } catch (Exception e) {
        }
        return usuarios;
    }
    Usuario user;

    public Usuario searchUsuario(int id) {

        try {
            HttpClient client = new HttpClient(new OnHttpRequestComplete() {
                @Override
                public void onComplete(Response status) {
                    if (status.isSuccess()) {

                        try {
                            JSONObject jsonUsuarios = new JSONObject(status.getResult());
                            user = Usuario.fromJson(jsonUsuarios);


                        } catch (Exception e) {
                        }

                    }
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

            });
            client.excecute("http://192.168.216.2:5000/api/user/" + id);
        } catch (Exception e) {
        }

        return user;
    }

    public boolean uploadToServer(String name, String lastName, String identification, String email, String grade, String position) {
        boolean res = false;
        try {
            URL url = new URL("http://192.168.216.2:5000/api/user");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            if (conn != null) {
                //Whatever you wants to post...                 
                String strPostData = "name=" + name + "&lastName=" + lastName + "&identification=" + identification + "&email=" + email + "&grade=" + grade + "&position=" + position;
                // String strPostData = "{pqrs_asunto:\"vnccvc\",\"pqrs_desc\":\"fgfddfg\",\"us_cdgo\":1}";

                conn.setRequestMethod("POST");
                conn.setRequestProperty("Accept-Language", "en-GB,en;q=0.5");
                conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                conn.setRequestProperty("Content-length", Integer.toString(strPostData.length()));
                conn.setRequestProperty("Content-Language", "en-GB");
                conn.setRequestProperty("charset", "utf-8");
                conn.setUseCaches(false);
                conn.setDoOutput(true);
                DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
                dos.writeBytes(strPostData);
                dos.flush();
                dos.close();
                int intResponse = conn.getResponseCode();
                System.out.println("\nSending 'POST' to " + url.toString()
                        + ", data: " + strPostData + ", rc: " + intResponse);
                if (intResponse == 200) {
                    res = true;
                    JOptionPane.showMessageDialog(null, "Usuario Registrado");

                } else {
                    res = false;
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
                }
            }
        } catch (Exception e) {
        }

        return res;

    }
    
    public boolean updateUsuario(String id ,String name, String lastName, String identification, String email, String grade, String position) {
        boolean res = false;
        try {
            URL url = new URL("http://192.168.216.2:5000/api/user/"+id);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            if (conn != null) {
                //Whatever you wants to post...                 
                String strPostData = "name=" + name + "&lastName=" + lastName + "&identification=" + identification + "&email=" + email + "&grade=" + grade + "&position=" + position;
                // String strPostData = "{pqrs_asunto:\"vnccvc\",\"pqrs_desc\":\"fgfddfg\",\"us_cdgo\":1}";

                conn.setRequestMethod("PUT");
                conn.setRequestProperty("Accept-Language", "en-GB,en;q=0.5");
                conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                conn.setRequestProperty("Content-length", Integer.toString(strPostData.length()));
                conn.setRequestProperty("Content-Language", "en-GB");
                conn.setRequestProperty("charset", "utf-8");
                conn.setUseCaches(false);
                conn.setDoOutput(true);
                DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
                dos.writeBytes(strPostData);
                dos.flush();
                dos.close();
                int intResponse = conn.getResponseCode();
                System.out.println("\nSending 'Put' to " + url.toString()
                        + ", data: " + strPostData + ", rc: " + intResponse);
                if (intResponse == 200) {
                    res = true;
                    JOptionPane.showMessageDialog(null, "Usuario Actualizado");

                } else {
                    res = false;
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
                }
            }
        } catch (Exception e) {
        }

        return res;

    }
}
