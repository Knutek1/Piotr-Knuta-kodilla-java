package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    List<Ingredient> ingredients;

    public Bigmac(Bun bun, int burgers, Sauce sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }
        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingredients(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build(){
            return new Bigmac(bun,burgers,sauce,ingredients);
        }

    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
    /*bun (pol. bułka do hamburgera – w odróżnieniu od roll – zwykłej bułki – może być z sezamem lub bez),
    burgers – oznaczającą ilość kotletów wołowych w środku kanapki,
    sauce – oznaczającą rodzaj użytego sosu (standard, 1000 wysp, barbecue), ingredients – oznaczającą listę składników dodatkowych (możliwe wartości to: sałata, cebula, bekon, ogórek, papryczki chilli, pieczarki, krewetki, ser).*/
}
