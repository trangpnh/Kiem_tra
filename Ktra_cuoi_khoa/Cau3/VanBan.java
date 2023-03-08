package Ktra_cuoi_khoa.Cau3;

public class VanBan {
    private String Content;
    public VanBan(){

    }

    public VanBan(String Content) {
        this.Content = Content;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public long Demtu(){
            StringBuffer arr = new StringBuffer(Content);
            long count = 0;
            for(int i = 0; i < arr.length() - 1; i++){
                if(arr.charAt(i) == ' ' && arr.charAt(i+1) != ' '){
                    count ++;
                }
            }
            return count;

    }
    public String Chuanhoa() {
        String temp = Content.trim().replaceAll("\\s+"," ");
        return temp;
    }
    public String Viethoa(){
        String temp = Content.toUpperCase();
        return temp;
    }
    public String Vietthuong(){
        String temp = Content.toLowerCase();
        return temp;
    }
    public String Viethoachucaidau(){
        Content = Vietthuong();
        StringBuffer arr = new StringBuffer(Content);
        arr.setCharAt(0, Character.toUpperCase(arr.charAt(0)));
        for (int i = 1; i < arr.length() - 1; i++){
            if(arr.charAt(i) == ' ' && arr.charAt(i+1) != ' '){
                arr.setCharAt(i+1, Character.toUpperCase(arr.charAt(i+1)));
            }
        }
        return arr.toString();
    }

    @Override
    public String toString() {
        return "VanBan[" +
                "Content='" + Content + '\'' +
                ']';
    }
}
