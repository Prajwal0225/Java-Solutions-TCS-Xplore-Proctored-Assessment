import java.util.*;

public class Solution{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Associate arr[] = new Associate[5];
		for(int i = 0;i<5;i++){
			arr[i] = new Associate(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		}	
        String searchTechnology = sc.next();
        Associate ans[] = associatesForGivenTechnology(arr,searchTechnology);
        for(int i = 0;i<ans.length;i++){
            System.out.println(ans[i].getid());
        }
   }
		
				
    public static Associate[] associatesForGivenTechnology(Associate arr[],String tech){
        int count = 0;
        for(int i = 0;i<5;i++){
            if(tech.equals(arr[i].gettechnology()) && arr[i].getexperienceInYears() % 5 == 0){
                count++;
            }
        }
        Associate arr1[] = new Associate[count];
        int k = 0;
        for(int i = 0;i<5;i++){
            if(tech.equals(arr[i].gettechnology()) && arr[i].getexperienceInYears() % 5 == 0){
            arr1[k] = arr[i];
            k++;
            }
        }
        return arr1;
    }
}

class Associate{
	private int id;
	private String name;
	private String technology;
	private int experienceInYears;


Associate(int id,String name,String technology,int experienceInYears){
		this.id = id;
		this.name = name;
		this.technology = technology;
		this.experienceInYears = experienceInYears;
	}
	
	void setid(int id){
		this.id = id;
	}
	int getid(){
		return this.id;
	}
	void setname(String name){
		this.name = name;
	}

	String getname(){
		return this.name;
	}

	void settechnology(String technology){
		this.technology = technology;
	}

	String gettechnology(){
		return this.technology;
	}

	void setexperienceInYears(int experienceInYears){
		this.experienceInYears = experienceInYears;
	}

	int getexperienceInYears(){
		return this.experienceInYears;
	}

	
}
