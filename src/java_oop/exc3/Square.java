package java_oop.exc3;

public class Square {
        private int side;
        public Square() {
                side = 5;
        }
        public Square(int side) {
                this.side = side;
        }
        public int getSide() {
                return side;
        }
        public void setSide(int side) {
                this.side = side;
        }

        public int perimeter(int side){
                return 4*side;
        }
        public int area(int side){
                return side*side;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Square square = (Square) o;
                return side == square.side;
        }

        @Override
        public String toString() {
                return "Square{" +
                        "side=" + side +
                        '}';
        }
}

