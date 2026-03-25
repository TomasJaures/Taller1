public class Concatenacion {
    public static String repetida(String[] strings){
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            result += strings[i];
        }

        return result;
    }

    public static String join(String[] strings){
        //StringBuilder
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }
}
