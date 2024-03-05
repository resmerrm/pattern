package creational.builder;

public class Coffee {
    private String type;
    private int milk;
    private int sugar;

    private Coffee(Builder builder) {
        this.type = builder.type;
        this.milk = builder.milk;
        this.sugar = builder.sugar;
    }

    public String getType() {
        return type;
    }

    public int getMilk() {
        return milk;
    }

    public int getSugar() {
        return sugar;
    }

    public static class Builder {
        private String type;
        private int milk;
        private int sugar;

        public Builder(String type) {
            this.type = type;
        }

        public Builder milk(int milk) {
            this.milk = milk;
            return this;
        }

        public Builder sugar(int sugar) {
            this.sugar = sugar;
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }
}

