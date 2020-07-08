package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class QuangCao implements Serializable {

@SerializedName("idQC")
@Expose
private String idQC;
@SerializedName("hinhanh")
@Expose
private String hinhanh;
@SerializedName("noidung")
@Expose
private String noidung;
@SerializedName("idbaihat")
@Expose
private String idbaihat;
@SerializedName("tenbh")
@Expose
private String tenbh;
@SerializedName("hinhbh")
@Expose
private String hinhbh;

public String getIdQC() {
return idQC;
}

public void setIdQC(String idQC) {
this.idQC = idQC;
}

public String getHinhanh() {
return hinhanh;
}

public void setHinhanh(String hinhanh) {
this.hinhanh = hinhanh;
}

public String getNoidung() {
return noidung;
}

public void setNoidung(String noidung) {
this.noidung = noidung;
}

public String getIdbaihat() {
return idbaihat;
}

public void setIdbaihat(String idbaihat) {
this.idbaihat = idbaihat;
}

public String getTenbh() {
return tenbh;
}

public void setTenbh(String tenbh) {
this.tenbh = tenbh;
}

public String getHinhbh() {
return hinhbh;
}

public void setHinhbh(String hinhbh) {
this.hinhbh = hinhbh;
}

}