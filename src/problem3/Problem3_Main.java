package problem3;

public class Problem3_Main {

    enum symbol{I,V,X,L,C,D,M};  //{1,5,10,50,100,500,1000};
    public static void main(String[] args) {
        System.out.println(romanToInt("MCDLXXVI"));
    }
    private static int romanToInt(String s)
    {
        if(s.length()>=1 && s.length()<=15) {
            char temp[] = new char[s.length()];
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                temp[i] = s.charAt(i);
            }
            for (int i = 0; i < s.length(); i++) {
                if(!(i==s.length()-1)){
                if (temp[i] == 'C' && temp[i + 1] == 'M') {
                    i++;
                    sum += 900;
                    continue;
                }
                if (temp[i] == 'X' && temp[i + 1] == 'C') {
                    i++;
                    sum += 90;
                    continue;
                }
                if (temp[i] == 'I' && temp[i + 1] == 'V') {
                    i++;
                    sum += 4;
                    continue;
                }
                    if (temp[i] == 'I' && temp[i + 1] == 'X') {
                        i++;
                        sum += 9;
                        continue;
                    }
                    if (temp[i] == 'X' && temp[i + 1] == 'L') {
                        i++;
                        sum += 40;
                        continue;
                    }
                    if (temp[i] == 'C' && temp[i + 1] == 'D') {
                        i++;
                        sum += 400;
                        continue;
                    }
                }
                switch (temp[i]) {
                    case 'I':
                        sum += 1;
                        break;
                    case 'V':
                        sum += 5;
                        break;
                    case 'X':
                        sum += 10;
                        break;
                    case 'L':
                        sum += 50;
                        break;
                    case 'C':
                        sum += 100;
                        break;
                    case 'D':
                        sum += 500;
                        break;
                    case 'M':
                        sum += 1000;
                        break;
                }
            }
            return sum;
        }
        else
            return 0;
    }
}
