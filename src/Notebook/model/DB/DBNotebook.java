package Notebook.model.DB;

public enum DBNotebook {
    senpai, chinchopa, anna228;

    public static boolean checkLogin(String myLogin){
        for(DBNotebook log: DBNotebook.values()){
            if(log.equals(myLogin)){
                return true;
            }
        }
        return false;
    }
}
