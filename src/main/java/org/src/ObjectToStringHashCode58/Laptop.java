package org.src.ObjectToStringHashCode58;

import java.util.Objects;

public class Laptop {
     public String model;
     public int price;

     @Override
     public String toString() {
          return "Laptop{" +
                  "model='" + model + '\'' +
                  ", price=" + price +
                  '}';
     }

     public boolean equals(Laptop that){
          return this.model == that.model && this.price == that.price;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Laptop laptop = (Laptop) o;
          return price == laptop.price && Objects.equals(model, laptop.model);
     }

     @Override
     public int hashCode() {
          return Objects.hash(model, price);
     }
}


