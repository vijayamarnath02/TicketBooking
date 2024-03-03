package Model;

public class Userpackage {
private int Id ;
private String PackageName;
private String Discount;
private int DiscountValue;
private int cost;

public Userpackage(int Id, String PackageName,String Discount,int DiscountValue,int cost) {
	this.Id=Id;
	this.PackageName=PackageName;
	this.Discount=Discount;
	this.DiscountValue=DiscountValue;
	this.cost=cost;
}

public int getId() {
	return Id;
}

public String getPackageName() {
	return PackageName;
}

public String getDiscount() {
	return Discount;
}

public int getDiscountValue() {
	return DiscountValue;
}

public int getCost() {
	return cost;
}

public void setId(int id) {
	Id = id;
}

public void setPackageName(String packageName) {
	PackageName = packageName;
}

public void setDiscount(String discount) {
	Discount = discount;
}

public void setDiscountValue(int discountValue) {
	DiscountValue = discountValue;
}

public void setCost(int cost) {
	this.cost = cost;
}



}
