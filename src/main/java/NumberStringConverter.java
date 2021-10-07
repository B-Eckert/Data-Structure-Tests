public class NumberStringConverter {
    public static String convert(int n){
        String end = "";
        String intString = Integer.toString(n);
        char intArr[] = intString.toCharArray();
        char reverse[] = new char[intArr.length];
        int counter = 0;
        for(int i = intArr.length - 1; i >= 0; i--) {
            reverse[counter] = intArr[i];
            counter++;
        }
        System.out.println(intString);
        intArr = reverse;
        for(int i = intArr.length - 1; i >= 0; i--) {
            boolean ty = false;
            boolean dred = false;
            boolean place = false;
            if((i + 2) % 3 == 0) {
                ty = true;
            }
            if((i + 1) % 3 == 0) {
                dred = true;
            }
            if(i % 3 == 0){
                place = true;
            }
            switch(intArr[i]) {
                case '1':
                    if(ty)
                        end+= "ten ";
                    else
                        end+= "one";
                    break;
                case '2':
                    if(ty)
                        end += "twenty ";
                    else
                        end+="two";
                    break;
                case '3':
                    if(ty)
                        end+="thirty ";
                    else
                        end+="three";
                    break;
                case '4':
                    if(ty)
                        end += "forty ";
                    else
                        end+= "four";
                    break;
                case '5':
                    if(ty)
                        end += "fifty ";
                    else
                        end+="five";
                    break;
                case '6':
                    end += "six";
                    break;
                case '7':
                    end += "seven";
                    break;
                case '8':
                    end += "eight";
                    if(ty)
                        end += "y ";
                    break;
                case '9':
                    end += "nine";
                    break;
            }
            if(intArr[i] - 48 >= 6 && intArr[i] - 48 != 8 && ty) {
                end += "ty ";
            }
            if(dred)
                end+= " hundred ";
            if(place) {
                int value = i / 3;
                if(value == 1){
                    end += " thousand ";
                }
                else if (value != 0){
                    if(value == 2)
                        end += " million ";
                    if(value == 3)
                        end += " billion ";
                }
            }
        }
        return end;
    }
}
