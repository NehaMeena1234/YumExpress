/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.util;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import yumxpress.pojo.ProductPojo;

/**
 *
 * @author Neha Meena
 */
public interface FoodApi {
    public ArrayList<ProductPojo> getFoodItemList(String searchKey);
    public ImageIcon getFoodItemById(int foodId);
    
}
