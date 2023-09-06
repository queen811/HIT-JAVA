package BTVN_Buoi6;
import java.util.*;
class VatLieu{
    private String ten;
    private String mauSac;
    private int doCung;
    public VatLieu(){}
    public VatLieu(String ten, String mauSac, int doCung) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getMauSac() {
        return mauSac;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public int getDoCung() {
        return doCung;
    }
    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter ten: ");
        ten = sc.nextLine();
        System.out.printf("Enter mau sac: ");
        mauSac = sc.nextLine();
        System.out.printf("Enter Do cung: ");
        doCung = sc.nextInt();
    }
    public void Xuat(){
        System.out.println("Ten: " + ten);
        System.out.println("Mau sac: " + mauSac);
        System.out.println("Do Cung: " + doCung);
    }
}

class HangHoa{
    private String maHang;
    private String tenHang;
    private float soLuong;
    private float donGia;
    private VatLieu[] dsVL;
    public HangHoa(){}
    public HangHoa(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dsVL = dsVL;
    }
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public float getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }
    public float getDonGia() {
        return donGia;
    }
    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    public VatLieu[] getDsVL() {
        return dsVL;
    }
    public void setDsVL(VatLieu[] dsVL) {
        this.dsVL = dsVL;
    }
    public void input(){
        Scanner sc1 = new Scanner(System.in);
        System.out.printf("Nhap ma hang: ");
        maHang = sc1.nextLine();
        System.out.printf("Nhap ten hang: ");
        tenHang = sc1.nextLine();
        System.out.printf("Nhap so luong: ");
        soLuong = sc1.nextFloat();
        System.out.printf("Nhap Don gia: ");
        donGia = sc1.nextFloat();
        dsVL = new VatLieu[(int) soLuong];
        for(int i = 0; i < soLuong; i++){
            sc1.nextLine();
            System.out.println("Nhap vat lieu " + (i + 1));
            dsVL[i] = new VatLieu();
            dsVL[i].Nhap();
        }
    }
    public void output(){
        System.out.println("Ma Hang: " + maHang);
        System.out.println("Ten Hang: " + tenHang);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        for(int i = 0; i < soLuong; i++){
            System.out.println("Vat Lieu " + (i + 1));
            dsVL[i].Xuat();
        }
    }
    public float TongTien(){
        return soLuong * donGia;
    }
}

class HangHoaGiaDung extends HangHoa{
    private String Chucnang;
    public HangHoaGiaDung(){}
    public String getChucnang() {
        return Chucnang;
    }
    public void setChucnang(String chucnang) {
        Chucnang = chucnang;
    }
    public HangHoaGiaDung(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL, String chucnang) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        Chucnang = chucnang;
    }
    @Override
    public void input(){
        Scanner sc2 = new Scanner(System.in);
        System.out.printf("Nhap chuc nang: ");
        Chucnang = sc2.nextLine();
        super.input();
    }
    @Override
    public void output(){
        System.out.println("Chuc nang: " + Chucnang);
        super.output();
    }
}

class HangHoaDienTu extends HangHoa{
    private int ThoigianBaoHanh;
    private int CongSuat;
    public HangHoaDienTu(){}
    public int getThoigianBaoHanh() {
        return ThoigianBaoHanh;
    }
    public void setThoigianBaoHanh(int thoigianBaoHanh) {
        ThoigianBaoHanh = thoigianBaoHanh;
    }
    public int getCongSuat() {
        return CongSuat;
    }
    public void setCongSuat(int congSuat) {
        CongSuat = congSuat;
    }
    public HangHoaDienTu(int thoigianBaoHanh, int congSuat) {
        ThoigianBaoHanh = thoigianBaoHanh;
        CongSuat = congSuat;
    }
    public HangHoaDienTu(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL,
                         int thoigianBaoHanh, int congSuat) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        ThoigianBaoHanh = thoigianBaoHanh;
        CongSuat = congSuat;
    }
    @Override
    public void input(){
        Scanner sc3 = new Scanner(System.in);
        System.out.printf("Nhap thoi gian bao hang: ");
        ThoigianBaoHanh = sc3.nextInt();
        System.out.printf("Nhap Cong suat: ");
        CongSuat = sc3.nextInt();
        super.input();
    }
    @Override
    public void output(){
        System.out.println("Thoi gian bao hanh: " + ThoigianBaoHanh);
        System.out.println("Cong suat: " + CongSuat);
        super.output();
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong: ");
        int n = sc.nextInt();
        ArrayList<HangHoaGiaDung> a = new ArrayList<HangHoaGiaDung>(n);
        ArrayList<HangHoaDienTu> b = new ArrayList<HangHoaDienTu>(n);
        for(int i = 0; i < n; i++){
            System.out.println("Nhap Hang hoa gia dung thu " + (i + 1));
            HangHoaGiaDung tmp = new HangHoaGiaDung();
            tmp.input();
            a.add(tmp);
        }
        for(HangHoaGiaDung x : a){
            System.out.println(x.TongTien());
            x.output();
        }
    }
}
