package org.example.day22.stack;

import java.util.Stack;

public class practice {
    public static boolean main(String[] args) {
        String[] s = {"밥","커피","밥","커피","밥","밥"};
        Stack<String> fstack = new Stack<>();


        for(int i=0;i<s.length;i++){
          if(s[i].equals("밥")){
              fstack.push(s[i]);
          }else if(s[i].equals("커피")){
              if(!fstack.isEmpty()&&fstack.peek().equals("밥")){
                  return true;
              }
          }
        }
        return false;
    }
}
