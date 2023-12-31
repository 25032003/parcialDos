package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class Pizzayolaarmo extends Pizza {
    public Pizzayolaarmo (String name, Topping... toppings){
        super(name,  toppings);

       Topping tp1 = new Topping("Tomato", 10);
         Topping tp2 = new Topping("Cheddar", 15);
            Topping tp3 = new Topping("Mozzarella", 5);
            Topping tp4 = new Topping("Parmesano", 20);
            Topping tp5 = new Topping("Jamon", 15);
            Topping tp6 = new Topping("Salame", 10);
            Topping tp7 = new Topping("Aceitunas", 9.5);
            Topping tp8 = new Topping("Cebolla", 10);
            Topping tp9 = new Topping("Champiñones", 8);
            Topping tp10 = new Topping("Carne", 10);
    }
}
