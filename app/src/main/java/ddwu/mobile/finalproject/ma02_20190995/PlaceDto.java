package ddwu.mobile.finalproject.ma02_20190995;

import java.io.Serializable;

public class PlaceDto implements Serializable {
    private long id;
    private String name; //가게 이름
    private String phone; //가게 전화번호
    private String address; //가게 위치
    private String date; //방문 날짜
    private String photoPath; //찍은 사진
    private String memo; //한줄평
    private int rating; //별점
    private String placeId; //식당 비건 유무

    public PlaceDto() {
    }

    //즐겨찾기 시 사용
    public PlaceDto(long id, String name, String phone, String address, String placeId) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.placeId = placeId;
    }

    //리뷰 시 사용
    public PlaceDto(long id, String name, String phone, String address, String date, String photoPath, String memo, int rating) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.date = date;
        this.photoPath = photoPath;
        this.memo = memo;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }


}

