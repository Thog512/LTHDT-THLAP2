
package Lap2b1;

import java.util.ArrayList;

public class AccountList {
    
    Account[] acclist;
    public int count;

    public AccountList(Account[] acclist, int count) {
        this.acclist = new Account[10];
        this.count = 0;
    }

    public AccountList(int n) {
        if(n<0){
            this.acclist = new Account[n];
            this.count = 0;
        }else{
            this.acclist = new Account[10];
            this.count = 0;
        }
    }

    AccountList() {
        
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public boolean addAcccount(Account account){
        if(count < acclist.length){
            acclist[count] = account;
            count++ ;
            return true;
        }else {
            return false;
        }
    }
    
    public void deleteAccount(long soTK){
        for(int i=0; i<count; i++){
            acclist[i] = acclist[i+1];
        }
        acclist[count-1] = null;
        count--;
    }      

    public Account findAccount(long soTK){
        for(int i=0; i<count; i++){
            if(acclist[i].equals(i)) {
                return acclist[i];
            }
        }
        return null;
    }
    
    public double gettotalAccount(){
        double total = 0;
        for(int i=0; i<count; i++){
            total += (double) acclist[i].getSoTK();
        }
        return total;
    }

    public void printAccount(){
        for(int i=0; i<count; i++){
            System.out.println("Số: "+acclist[i].getSoTK());
        }
    }
}
