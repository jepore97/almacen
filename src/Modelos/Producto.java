/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author H-P
 */
public class Producto {
    private int idProducto;
    private String item;
    private int stock;

    public Producto() {
        this.idProducto = idProducto;
        this.item = item;
        this.stock = stock;
    }

    
    public Producto(int idProducto, String item, int stock) {
        this.idProducto = idProducto;
        this.item = item;
        this.stock = stock;
    }

    public Producto(String item, int stock) {
        this.item = item;
        this.stock = stock;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public static Producto fromJson(JSONObject jsonObject) {
  	Producto b = new Producto();
        // Deserialize json into object fields
  	try {
  		b.idProducto = jsonObject.getInt("idProducto");
        	b.item = jsonObject.getString("item");
        	b.stock = jsonObject.getInt("stock");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
  	// Return new object
  	return b;
  }
   
   public static ArrayList<Producto> fromJson(JSONArray jsonArray) {
      JSONObject productosJson;
      ArrayList<Producto> productos = new ArrayList<Producto>(jsonArray.length());
      // Process each result in json array, decode and convert to business object
      for (int i=0; i < jsonArray.length(); i++) {
          try {
          	productosJson = jsonArray.getJSONObject(i);
          } catch (Exception e) {
              e.printStackTrace();
              continue;
          }

          Producto productosFromJson = Producto.fromJson(productosJson);
          if (productosFromJson != null) {
          	productos.add(productosFromJson);
          }
      }

      return productos;
  }
    
}
