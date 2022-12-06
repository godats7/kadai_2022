package leewookjong_kadai3;

public class Kamoku {

	String kamokumei;
	String namae;
	int kamokuTennsuu;
    
    
    public Kamoku() {
        kamokumei = null;
        namae = null;
        kamokuTennsuu = 0;
    }
    
    public Kamoku(String major,String name, int score) {
        kamokumei = major;
        namae = name;
        kamokuTennsuu = score;       
    }
    
    //setter getter
    public String getKamokumei() {
		return kamokumei;
	}
	public void setKamokumei(String kamokumei) {
		this.kamokumei = kamokumei;
	}
	public String getNamae() {
		return namae;
	}
	public void setNamae(String namae) {
		this.namae = namae;
	}
	public int getKamokuTennsuu() {
		return kamokuTennsuu;
	}
	public void setKamokuTennsuu(int kamokuTennsuu) {
		this.kamokuTennsuu = kamokuTennsuu;
	}
    


}
