package dataStructure;

import java.awt.Color;

import javax.tools.DocumentationTool.Location;

import utils.Point3D;

public class  Node implements node_data {

	int key;
	Point3D Location;
	double weight;
	String info ;
	Color tag;
	
	public Node (int key,Point3D Location) {
		this.key = key;
		this.setLocation(Location);		
	}

	@Override
	public int getKey() {
		
		return this.key;
	}

	@Override
	public Point3D getLocation() {
		// TODO Auto-generated method stub
		return this.Location;
	}

	@Override
	public void setLocation(Point3D p) {
		// TODO Auto-generated method stub
		this.Location = new Point3D(p.x(), p.y(), p.z());
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	@Override
	public void setWeight(double w) {
		// TODO Auto-generated method stub
		this.weight = w;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.info;
	}

	@Override
	public void setInfo(String s) {
		// TODO Auto-generated method stub
		this.info = s;		
	}

	@Override
	public int getTag() {
		// TODO Auto-generated method stub
		return this.tag.getRGB();
	}

	@Override
	public void setTag(int t) {
		this.tag = new Color(t);		
	}
	

}