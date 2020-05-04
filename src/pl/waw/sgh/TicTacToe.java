package pl.waw.sgh;

import java.util.*;

    public class TicTacToe {

        static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
        static ArrayList<Integer> COMPUTERPosition = new ArrayList<Integer>();

        public static void main(String[] args) {
            char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' '}};
            PrintGameBoard(gameBoard);
            // cpuPosition=COMPUTERPosition
            //playerpositions=playerpostions

            while (true) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Pick move (1-9):");
                int playerPos = scan.nextInt();
                while (playerPositions.contains(playerPos) || COMPUTERPosition.contains(playerPositions)){
                    System.out.println("Position Taken!!");
                    playerPos = scan.nextInt();
                }
                placePiece(gameBoard, playerPos,"Human");
//        String result= Winner();
//        if (result.length()>0) {
//            System.out.println(result);
//            break;
//        }
                Random rand = new Random();
                int COMPUTERPos = rand.nextInt(9) + 1;
                while (playerPositions.contains(COMPUTERPos) || COMPUTERPosition.contains(COMPUTERPos)){
                    System.out.println(" ");
                    COMPUTERPos = rand.nextInt(9) + 1;
                }
                placePiece(gameBoard, COMPUTERPos,"COMPUTER");
                PrintGameBoard(gameBoard);
                String result= Winner();
                System.out.println(result);
                if (result.length()>0) {
                    System.out.println(result);
                    break;
                }

                PrintGameBoard(gameBoard);
                result=Winner();
                if (result.length()>0){
                    System.out.println(result);
                    break;
//                System.out.println("Position Taken!!");
//            COMPUTERPos = rand.nextInt(9) + 1;
//            place1(gameBoard, COMPUTERPosition, "COMPUTER");
//            PrintGameBoard(gameBoard);
//
//            String result= Winner();
//            System.out.println(result);
                }

            }
        }
        public static void PrintGameBoard ( char[][] gameBoard){
            for (char[] line : gameBoard) {
                for (char c : line) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
        public static void placePiece ( char[][] gameBoard, int pos, String user){
            char symbol = ' ';
            if (user.equals("Human")) {
                symbol = 'X';
                playerPositions.add(pos);
            } else if (user.equals("COMPUTER")) {
                symbol = 'O';
                COMPUTERPosition.add(pos);
            }
            switch (pos) {
                case 1:
                    gameBoard[0][0] = symbol;
                    break;
                case 2:
                    gameBoard[0][2] = symbol;
                    break;
                case 3:
                    gameBoard[0][4] = symbol;
                    break;
                case 4:
                    gameBoard[2][0] = symbol;
                    break;
                case 5:
                    gameBoard[2][2] = symbol;
                    break;
                case 6:
                    gameBoard[2][4] = symbol;
                    break;
                case 7:
                    gameBoard[4][0] = symbol;
                    break;
                case 8:
                    gameBoard[4][2] = symbol;
                    break;
                case 9:
                    gameBoard[4][4] = symbol;
                    break;
                default:
                    break;

            }

        }

        public static String Winner(){
            List topLine= Arrays.asList(1,2,3);
            List midLine= Arrays.asList(4,5,6);
            List botLine= Arrays.asList(7,8,9);
            List firstcolumn= Arrays.asList(1,4,7);
            List midcolumn= Arrays.asList(2,5,8);
            List lastcolumn= Arrays.asList(3,6,9);
            List diagonalright= Arrays.asList(1,5,9);
            List diagonalleft= Arrays.asList(3,5,7);

            List<List> Win= new ArrayList<List>();
            Win.add(topLine);
            Win.add(botLine);
            Win.add(midLine);
            Win.add(firstcolumn);
            Win.add(midcolumn);
            Win.add(lastcolumn);
            Win.add(diagonalleft);
            Win.add(diagonalright);
            for (List l:Win) {
                if(playerPositions.containsAll(l)){
                    return "Yeahhhhh You are a BEASTTTTT";
                } else if(COMPUTERPosition.containsAll(l)){
                    return "LOOOOOOOOOOOOOSSSSSSSERRRRRRR";
                } else if (playerPositions.size()+ COMPUTERPosition.size() ==9){
                    return "TIE, BOTH LOSERS";
                }


            }



            return "";

        }
    }
