import java.util.*;
public class HashMaps {
    public static HashMap<Character,String[]> createCharacterMap(){
        HashMap<Character,String[]> map = new HashMap<>();
        map.put('O',new String[] {
            "   ***   ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            "   ***   " });
        map.put('O',new String[] {
            "   ***   ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            "   ***   " });
        map.put('P',new String[] {
            " ******  ",
            " **   ** ",
            " **   ** ",
            " ******  ",
            " **      ",
            " **      ",
            " **      " });
        map.put('S',new String[] {
            "  ****** ",
            " **      ",
            " **      ",
            "  ****** ",
            "       **",
            "       **",
            "  ****** "});

        return map;
    }

    public static void diaplayBanner(String message, HashMap<Character,String[]> map){
        int patternHeight=map.get('O').length;

        // String defaultPattern[] ={
        //     "          ",
        //     "          ",
        //     "          ",
        //     "          ",
        //     "          ",
        //     "          ",
        //     "          ",};
        for(int i=0;i<patternHeight;i++)
        {
            StringBuilder row=new StringBuilder();
            for(int j=0;j<message.length();j++){
                row.append(map.get(message.charAt(j))[i]);
            }
            System.out.println(row.toString());
            
        }
    }

    public static void main(String[] args){
        HashMap<Character,String[]> map = createCharacterMap();
        String message ="OOPS";
        diaplayBanner(message, map);
    }


    
}
