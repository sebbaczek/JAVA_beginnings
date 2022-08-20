package collections.exc6;

public class Square {
        private int side;

        public Square(final int side) {
                this.side = side;
        }

        public int getSide() {
                return side;
        }

        public void setSide(int side) {
                this.side = side;
        }

        public int perimeter() {
                return 4 * this.getSide();
        }

        public int area() {
                return this.getSide() * this.getSide();
        }

        @Override
        public String toString() {
                return "Square{" +
                        "side=" + side +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Square square = (Square) o;

                return side == square.side;
        }

        @Override
        public int hashCode() {
                return side;
        }
}
