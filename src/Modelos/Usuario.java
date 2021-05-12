package Modelos;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Usuario {
    
    private int cdgoUsuario;
    private String nombres;
    private String apellidos;
    private String correo;
    private String cedula;
    private String cargo;
    private String grado;

    public Usuario() {
    }

    public Usuario(int cdgoUsuario) {
        this.cdgoUsuario = cdgoUsuario;
    }

    public int getCdgoUsuario() {
        return cdgoUsuario;
    }

    public void setCdgoUsuario(int cdgoUsuario) {
        this.cdgoUsuario = cdgoUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

   
    
    public static Usuario fromJson(JSONObject jsonObject) {
  	Usuario b = new Usuario();
        // Deserialize json into object fields
  	try {
                b.cdgoUsuario=jsonObject.getInt("id");
  		b.nombres = jsonObject.getString("name");
        	b.apellidos = jsonObject.getString("lastname");
        	b.correo = jsonObject.getString("email");
        	b.cargo = jsonObject.getString("position");
                b.cedula = jsonObject.getString("identification");
                b.grado = jsonObject.getString("grade");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
  	// Return new object
  	return b;
  }
   
   public static ArrayList<Usuario> fromJson(JSONArray jsonArray) {
      JSONObject usuariosJson;
      ArrayList<Usuario> usuarios = new ArrayList<Usuario>(jsonArray.length());
      // Process each result in json array, decode and convert to business object
      for (int i=0; i < jsonArray.length(); i++) {
          try {
          	usuariosJson = jsonArray.getJSONObject(i);
          } catch (Exception e) {
              e.printStackTrace();
              continue;
          }

          Usuario usuariosFromJson = Usuario.fromJson(usuariosJson);
          if (usuariosFromJson != null) {
          	usuarios.add(usuariosFromJson);
          }
      }

      return usuarios;
  }
}
