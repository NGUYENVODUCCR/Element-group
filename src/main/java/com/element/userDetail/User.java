package com.element.userDetail;

// Lớp User dùng để đại diện thông tin người dùng
public class User {
    // Thuộc tính lưu tên người dùng
    private String username;

    // Thuộc tính lưu email của người dùng0
    private String email;

    // Thuộc tính lưu tuổi của người dùng
    private int age;

    // Thuộc tính lưu địa chỉ của người dùng
    private String address;

    // Getter để lấy giá trị của username
    public String getUsername() {
        return username;
    }

    // Setter để gán giá trị cho username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter để lấy giá trị của email
    public String getEmail() {
        return email;
    }

    // Setter để gán giá trị cho email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter để lấy giá trị của age
    public int getAge() {
        return age;
    }

    // Setter để gán giá trị cho age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter để lấy giá trị của address
    public String getAddress() {
        return address;
    }

    // Setter để gán giá trị cho address
    public void setAddress(String address) {
        this.address = address;
    }
}
