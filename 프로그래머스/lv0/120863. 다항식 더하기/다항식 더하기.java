class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int coefficient = 0;
        int constant = 0;
        if(polynomial.length() == 1 || polynomial.length() == 2){
            if(polynomial.equals("1x")){
                polynomial = "x";
            }
            return polynomial;
        }
        polynomial = polynomial.replaceAll(" ","");
        String [] operand = polynomial.split("[ + ]");
        for (int i = 0; i<operand.length; i++){
            if(operand[i].contains("x")){
                if(operand[i].equals("x")){
                    coefficient += 1;
                }
                else {
                    String temp = operand[i].substring(0, operand[i].length()-1);
                    coefficient += Integer.parseInt(temp);
                }
            }
            else {
                constant += Integer.parseInt(operand[i]);
            }
            System.out.println(coefficient + " " + constant);
        }
        if(constant == 0){
            answer += coefficient+"x";
        }else if(coefficient == 0){
            answer += constant;
        } 
        else {
            if (coefficient == 1){
                answer = "x + "+constant;
            }
            else {
                answer = coefficient+"x + "+constant;
            }
        }
        return answer;
    }
}