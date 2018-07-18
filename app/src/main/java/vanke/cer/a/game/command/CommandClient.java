package vanke.cer.a.game.command;

import android.util.Log;

/**
 * Created by zhangcheng on 2018/7/18.
 */

public class CommandClient {

    private static  CommandClient commandClient;
    AbsCommand absCommand;

    private CommandClient(){
            absCommand=new AbsCommand<String,String>() {
            @Override
            public void doEx(String o, String o2) {
               System.out.print(o+o2);
            }
        };
    }

    public static  CommandClient getInstance(){

        if(commandClient==null) {
            synchronized (CommandClient.class){
                commandClient=new CommandClient();

            }
        }
        return  commandClient;
    }


    public void sendCommond(){
        if (absCommand!=null){
            absCommand.doEx("wo","ta");
        }
    }



}
