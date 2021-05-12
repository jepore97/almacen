/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Modelos.Producto;
import Modelos.Usuario;
import com.devazt.networking.HttpClient;
import com.devazt.networking.OnHttpRequestComplete;
import com.devazt.networking.Response;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author H-P
 */
public class ServicioProductos {
    ArrayList<Producto> productos;
    public ArrayList<Producto> getProductos() {
        try {
            productos = new ArrayList<Producto>();
            HttpClient client = new HttpClient(new OnHttpRequestComplete() {
                @Override
                public void onComplete(Response status) {
                    if (status.isSuccess()) {

                        try {
                            JSONArray jsonUsuarios = new JSONArray(status.getResult());
                            productos = Producto.fromJson(jsonUsuarios);
                            for (int i = 0;; i++) {
                                System.out.println(productos.get(i).getItem());
                                //System.out.println(jsonUsuarios.getJSONObject(i).get("name").toString());
                            }

                        } catch (Exception e) {
                        }

                    }
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

            });
            client.excecute("http://192.168.216.2:5000/api/user");
        } catch (Exception e) {
        }
        return productos;
    }
    Producto product;

    public Producto searchProducto(int id) {

        try {
            HttpClient client = new HttpClient(new OnHttpRequestComplete() {
                @Override
                public void onComplete(Response status) {
                    if (status.isSuccess()) {

                        try {
                            JSONObject jsonProducto = new JSONObject(status.getResult());
                            product = Producto.fromJson(jsonProducto);

                            System.out.println(product.getItem());

                        } catch (Exception e) {
                        }

                    }
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

            });
            client.excecute("https://jsonplaceholder.typicode.com/users/" + id);
        } catch (Exception e) {
        }

        return product;
    }

    public boolean uploadToServer(String item, String stock) {
        boolean res = false;
        try {
            URL url = new URL("http://192.168.216.2:5000/api/user");//cambiar direccion cuando se hagan los controllers
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            if (conn != null) {
                //Whatever you wants to post...                 
                String strPostData = "item=" + item + "&stock=" + stock  ;

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
                    JOptionPane.showMessageDialog(null, "Producto Registrado");

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
