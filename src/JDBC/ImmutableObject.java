package JDBC;

public class ImmutableObject {

        private final int amount;
        private final char character;

        public ImmutableObject(int amount, char character) {
            this.amount = amount;
            this.character = character;
        }

        public int getAmount() {
            return amount;
        }

        public ImmutableObject setAmount(int amount) {
            return new ImmutableObject(amount, this.character);
        }

        public char getCharacter() {
            return character;
        }

        public ImmutableObject setCharacter(char character) {
            return new ImmutableObject(this.amount, character);
        }
    }

