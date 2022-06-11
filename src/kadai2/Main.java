package kadai2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	Flower floa = new Flower("チューリップ", "鉢", 500);
	Flower flob = new Flower("ユリ", "鉢", 800);
	Flower floc = new Flower("バラ", "花束", 1000);
	Flower flod = new Flower("ヒマワリ", "花束", 1100);

	System.out.println(floa.getName() + "は" + floa.getType() + "で売っており" + floa.getPrice() + "円です。");
	System.out.println(flob.getName() + "は" + flob.getType() + "で売っており" + flob.getPrice() + "円です。");
	System.out.println(floc.getName() + "は" + floc.getType() + "で売っており" + floc.getPrice() + "円です。");
	System.out.println(flod.getName() + "は" + flod.getType() + "で売っており" + flod.getPrice() + "円です。");

	floa.setPrice(450);
	floc.setPrice(950);
	floc.setPrice(950);

	System.out.println("5月22日に" + floa.getName() + "は" + floa.getPrice() + "円に値下げされます。");
	System.out.println("5月22日に" + floc.getName() + "は" + floc.getPrice() + "円に値下げされます。");

	List<Flower> flowerList = new ArrayList<Flower>();

	Flower floe = new Flower("カーネーション", "花束", 1100);
	Flower flof = new Flower("パンジー", "鉢", 550);
	Flower flog = new Flower("しょうぶ", "鉢", 200);

	flowerList.add(floe);
	flowerList.add(flof);
	flowerList.add(flog);

	for (Flower flower : flowerList) {
	    System.out.println(flower.getName() + "が" + flower.getType() + "で" + flower.getPrice() + "円で入荷されます。");

	}

	if (floa.getType().equals("鉢")) {
	    System.out.println(floa.getName() + "は2割引きされます。");
	} else if (floa.getType().equals("花束")) {
	    System.out.println(floa.getName() + "は3割引きされます。");
	} else if (floa.getType().equals("ドライフラワー")) {
	    System.out.println(floa.getName() + "は1割引きされます。");
	}
    }
}