import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class readInput {

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "puzzleInputAdventOfCode.txt";
        int answer = readInput(filename);
        System.out.print("The final number is: ");
        System.out.println(answer);
    }

    private static int readInput(String filename) throws FileNotFoundException {
        String input;
        char firstDigit = 'n';
        char secondDigit = 'n';

        FileReader fr = new FileReader(filename);
        Scanner scanInput = new Scanner(fr);

        int addUpOutput = 0;

        while(scanInput.hasNext()){
            int digitcount = 1;

            input = scanInput.nextLine();
            StringBuilder current = new StringBuilder();
            current.append(input);

            char[] inputAscharArray = input.toCharArray();
            for(int i = 0; i < inputAscharArray.length; i++){
                char currentChar = inputAscharArray[i];
                if(Character.isDigit(currentChar)){
                    if(digitcount == 1){
                        firstDigit = inputAscharArray[i];
                        digitcount++;
                    } else if(digitcount > 1){
                        secondDigit = inputAscharArray[i];
                    }
                } else if(inputAscharArray[i] == 'o'){
                    if(i+3 <= inputAscharArray.length) {
                        String substring = current.substring(i, i + 3);
                        System.out.println(substring);
                        if (substring.equals("one")) {
                            if (digitcount == 1) {
                                firstDigit = '1';
                                digitcount++;
                            } else if (digitcount > 1) {
                                secondDigit = '1';
                            }
                        }
                    }
                } else if(inputAscharArray[i] == 't'){
                    if(i+5 <= inputAscharArray.length) {
                        String substring = current.substring(i, i + 5);
                        System.out.println(substring);
                        if (substring.equals("three")) {
                            if (digitcount == 1) {
                                firstDigit = '3';
                                digitcount++;
                            } else if (digitcount > 1) {
                                secondDigit = '3';
                            }
                        }
                    }
                    if(i+3 <= inputAscharArray.length) {
                        String substring = current.substring(i, i + 3);
                        System.out.println(substring);
                        if (substring.equals("two")) {
                            if (digitcount == 1) {
                                firstDigit = '2';
                                digitcount++;
                            } else if (digitcount > 1) {
                                secondDigit = '2';
                            }
                        }
                    }
                } else if(inputAscharArray[i] == 'f'){
                    if(i+4 <= inputAscharArray.length) {
                        String substring = current.substring(i, i + 4);
                        System.out.println(substring);
                        if (substring.equals("four")) {
                            if (digitcount == 1) {
                                firstDigit = '4';
                                digitcount++;
                            } else if (digitcount > 1) {
                                secondDigit = '4';
                            }
                        }
                        if (substring.equals("five")) {
                            if (digitcount == 1) {
                                firstDigit = '5';
                                digitcount++;
                            } else if (digitcount > 1) {
                                secondDigit = '5';
                            }
                        }
                    }
                } else if(inputAscharArray[i] == 's'){
                    if(i+3 <= inputAscharArray.length) {
                        String substring = current.substring(i, i + 3);
                        System.out.println(substring);
                        if (substring.equals("six")) {
                            if (digitcount == 1) {
                                firstDigit = '6';
                                digitcount++;
                            } else if (digitcount > 1) {
                                secondDigit = '6';
                            }
                        }
                    }
                    if(i+5 <= inputAscharArray.length) {
                        String substring = current.substring(i, i + 5);
                        System.out.println(substring);
                        if (substring.equals("seven")) {
                            if (digitcount == 1) {
                                firstDigit = '7';
                                digitcount++;
                            } else if (digitcount > 1) {
                                secondDigit = '7';
                            }
                        }
                    }
                } else if(inputAscharArray[i] == 'e'){
                    if( i+5 <= inputAscharArray.length) {
                        String substring = current.substring(i, i + 5);
                        System.out.println(substring);
                        if (substring.equals("eight")) {
                            if (digitcount == 1) {
                                firstDigit = '8';
                                digitcount++;
                            } else if (digitcount > 1) {
                                secondDigit = '8';
                            }
                        }
                    }
                } else if(inputAscharArray[i] == 'n') {
                    if (i + 4 <= inputAscharArray.length) {
                        String substring = current.substring(i, i + 4);
                        System.out.println(substring);
                        if (substring.equals("nine")) {
                            if (digitcount == 1) {
                                firstDigit = '9';
                                digitcount++;
                            } else if (digitcount > 1) {
                                secondDigit = '9';
                            }
                        }
                    }
                } else if(inputAscharArray[i] == 'z') {
                    if (i + 4 <= inputAscharArray.length) {
                        String substring = current.substring(i, i + 4);
                        System.out.println(substring);
                        if (substring.equals("zero")) {
                            if (digitcount == 1) {
                                firstDigit = '0';
                                digitcount++;
                            } else if (digitcount > 1) {
                                secondDigit = '0';
                            }
                        }
                    }
                }

                System.out.print("First digit is ");
                System.out.println(firstDigit);
                System.out.print("Second digit is ");
                System.out.println(secondDigit);
            }

            if(secondDigit == 'n'){
                secondDigit = firstDigit;
            }

            if(firstDigit != 'n') {
                StringBuilder s = new StringBuilder();
                s.append(firstDigit);
                s.append(secondDigit);
                String output = s.toString();

                System.out.println(s);

                int out = Integer.parseInt(output);
                addUpOutput += out;
            }
            secondDigit = 'n';
            firstDigit = 'n';
        }

       return addUpOutput;
    }

}
