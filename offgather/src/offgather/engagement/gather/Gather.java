package offgather.engagement.gather;

import java.io.Serializable;

public class Gather implements Serializable{
	int gatherIdnum;
	int groupIdnum;
	int gatherTime;
	int gatherMaxNum;
	String gatherTitle;
	String gatherDescribe;
	String gatherPhoto;
	String gatherDate;
	String gatherLocation;
	String gatherIsPublic;
	
	public Gather() {
	}
	
	public Gather(int gatherIdnum, int groupIdnum, int gatherTime, int gatherMaxNum, String gatherTitle,
			String gatherDescribe, String gatherPhoto, String gatherDate, String gatherLocation,
			String gatherIsPublic) {
		super();
		this.gatherIdnum = gatherIdnum;
		this.groupIdnum = groupIdnum;
		this.gatherTime = gatherTime;
		this.gatherMaxNum = gatherMaxNum;
		this.gatherTitle = gatherTitle;
		this.gatherDescribe = gatherDescribe;
		this.gatherPhoto = gatherPhoto;
		this.gatherDate = gatherDate;
		this.gatherLocation = gatherLocation;
		this.gatherIsPublic = gatherIsPublic;
	}

	public int getGatherIdnum() {
		return gatherIdnum;
	}

	public void setGatherIdnum(int gatherIdnum) {
		this.gatherIdnum = gatherIdnum;
	}

	public int getGroupIdnum() {
		return groupIdnum;
	}

	public void setGroupIdnum(int groupIdnum) {
		this.groupIdnum = groupIdnum;
	}

	public int getGatherTime() {
		return gatherTime;
	}

	public void setGatherTime(int gatherTime) {
		this.gatherTime = gatherTime;
	}

	public int getGatherMaxNum() {
		return gatherMaxNum;
	}

	public void setGatherMaxNum(int gatherMaxNum) {
		this.gatherMaxNum = gatherMaxNum;
	}

	public String getGatherTitle() {
		return gatherTitle;
	}

	public void setGatherTitle(String gatherTitle) {
		this.gatherTitle = gatherTitle;
	}

	public String getGatherDescribe() {
		return gatherDescribe;
	}

	public void setGatherDescribe(String gatherDescribe) {
		this.gatherDescribe = gatherDescribe;
	}

	public String getGatherPhoto() {
		return gatherPhoto;
	}

	public void setGatherPhoto(String gatherPhoto) {
		this.gatherPhoto = gatherPhoto;
	}

	public String getGatherDate() {
		return gatherDate;
	}

	public void setGatherDate(String gatherDate) {
		this.gatherDate = gatherDate;
	}

	public String getGatherLocation() {
		return gatherLocation;
	}

	public void setGatherLocation(String gatherLocation) {
		this.gatherLocation = gatherLocation;
	}

	public String getGatherIsPublic() {
		return gatherIsPublic;
	}

	public void setGatherIsPublic(String gatherIsPublic) {
		this.gatherIsPublic = gatherIsPublic;
	}
	
}
