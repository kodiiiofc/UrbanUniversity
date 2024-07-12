package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Field {
    ArrayList<Cell> field;
    private boolean isPlaying = false;
    private final String DELIMITER = "---------";
    private final String PLAYER_X = "Крестики";
    private final String PLAYER_O = "Нолики";
    private final String STARTS = "Игра начата!";
    private final String MOVE = "Сейчас ходят ";
    private final String IT_IS_DRAW = "Игра окончена ничьей!";
    private final String ASK_FOR_COORDINATES = "Введите координаты X Y через пробел в диапозоне [1, 3]";
    private final String CELL_IS_FILLED = "Данная ячейка уже заполнена";
    private final char[] SYMBOLS = {'O', 'X'};
    private Scanner input = new Scanner(System.in);

    // Создаем массив поля и заполняем его пустыми ячейками

    public Field() {
        field = new ArrayList<>();
        for (int y = 1; y < 4; y++) {
            for (int x = 1; x < 4; x++) {
                field.add(new Cell(x, y));
            }
        }
        status();
    }

    // Метод запуска игры, который ведет счетчик ходов (9 - поле заполнено (ничья), и поочередно запрашивает ход Ноликов и Крестиков)

    public void start() {
        isPlaying = true;
        String currentPlayer;
        System.out.println(STARTS);
        int counter = 0;
        while (isPlaying) {
            for (char symbol : SYMBOLS) {
                currentPlayer = symbol == 'X' ? PLAYER_X : PLAYER_O;
                System.out.println(MOVE + currentPlayer);
                inputMove(symbol);
                counter++;
                if (counter == 9 || isPlaying == false) {
                    isPlaying = false;
                    return;
                }
            }

        }
        System.out.println(IT_IS_DRAW);
    }

    // Метод вывода поля в консоль

    public void status() {
        System.out.println(DELIMITER);
        for (Cell cell : field) {
            System.out.print(cell);
            if (cell.getX() == 3) System.out.println();
            else System.out.print(" | ");
        }
        System.out.println(DELIMITER);
    }

    // Метод передачи считывания координат из консоли и передачи их в метод хода move(int x, int y, symbol)

    private void inputMove(char symbol) {
        System.out.println(ASK_FOR_COORDINATES);
        int x = 0, y = 0;
        boolean isSetting = true;
        while (isSetting) {
            x = input();
            y = input();
            if (!isInRange(x) || !isInRange(y)) {
                System.out.println("Допустимо вводить только числа в диапазоне [1,3]");
                isSetting = true;
            }
            else isSetting = false;
        }
        move(x, y, symbol);
    }

    // Метод запроса из консоли чисел с проверкой их принадлежности к диапозону 1..3 через RegEx

    private int input() {
        if (input.hasNext("[123]")) return input.nextInt();
        input.next();
        return 0;
    }

    // Метод проверка принадлежности диапзону (для других случаев)

    private boolean isInRange(int coordinate) {
        return (coordinate >= 1 && coordinate <= 3);
    }

    // Сам метод хода в нем: в пустую ячейку вписывается передаваемый символ, иначе повторный запрос на ввод

    private void move(int x, int y, char symbol) {
        Cell currentCell = field.get(getIndexOfCell(x, y));
        if (!currentCell.isFilled()) {
            currentCell.set(symbol);
            status();
            checkLine(symbol);
        } else {
            System.out.println(CELL_IS_FILLED);
            inputMove(symbol);
        }
    }

    // Метод получения индекса массива по координатам ячейки

    public int getIndexOfCell(int x, int y) {
        for (int i = 0; i < field.size(); i++) {
            if (field.get(i).getX() == x && field.get(i).getY() == y) {
                return i;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    // Метод проверки выигрышных комбинаций

    public void checkLine(char symbol) {
        checkColumns(symbol);
        checkRows(symbol);
        checkDiagonals(symbol);
    }

    // Метод проверки выигрышной вертикальной линии

    private void checkColumns(char symbol) {
        String player = symbol == 'X' ? PLAYER_X : PLAYER_O;

        int x = 1;
        int y = 1;

        int counter;

        while (x < 4) {
            counter = 0;
            while (y < 4) {
                Cell currentCell = field.get(getIndexOfCell(x, y));
                y++;
                if (currentCell.getFill() != symbol) break;
                counter++;
            }
            y = 1;

            if (counter == 3) {
                System.out.println(player + " выиграли. Заполнен столбец " + x);
                isPlaying = false;
                return;
            }

            x++;

        }
    }

    // Метод проверки выигрышной горизонтальной линии

    private void checkRows(char symbol) {
        String player = symbol == 'X' ? PLAYER_X : PLAYER_O;

        int x = 1;
        int y = 1;

        int counter;

        while (y < 4) {
            counter = 0;
            while (x < 4) {
                Cell currentCell = field.get(getIndexOfCell(x, y));
                x++;
                if (currentCell.getFill() != symbol) break;
                counter++;
            }
            x = 1;

            if (counter == 3) {
                System.out.println(player + " выиграли. Заполнена строка " + y);
                isPlaying = false;
                return;
            }
            y++;

        }
    }

    // Метод проверки выигрышной диагонали

    private void checkDiagonals(char symbol) {
        String player = symbol == 'X' ? PLAYER_X : PLAYER_O;

        int x = 1;
        int y;
        int counter = 0;
        while (x < 4) {
            Cell currentCell = field.get(getIndexOfCell(x, x));
            x++;
            if (currentCell.getFill() != symbol) {
                break;
            }
            counter++;
        }
        if (counter == 3) {
            System.out.println(player + " выиграли. Заполнена нисходящая диагональ");
            isPlaying = false;
            return;
        }

        counter = 0;
        x = 1;
        y = 3;

        while (x < 4) {
            Cell currentCell = field.get(getIndexOfCell(x, y));
            x++;
            y--;
            if (currentCell.getFill() != symbol) {
                break;
            }
            counter++;
        }
        if (counter == 3) {
            System.out.println(player + " выиграли. Заполнена восходящая диагональ");
            isPlaying = false;
        }
    }

    // Вложенный класс ячейки массива с координатами x, y и данным о заполнении

    private class Cell {
        private final int x;
        private final int y;
        private char fill;

        public Cell(int x, int y) {
            this.x = x;
            this.y = y;
            fill = '\u0020';
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void set(char symbol) {
            fill = symbol;
        }

        public char getFill() {
            return fill;
        }

        public boolean isFilled() {
            return !(fill == '\u0020');
        }

        // Переопределение метода перевода строку, с целью вывода содержания

        @Override
        public String toString() {
            return Character.toString(fill);
        }
    }

}


