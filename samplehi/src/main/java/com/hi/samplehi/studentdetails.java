package com.hi.samplehi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class studentdetails {
	
		@javax.persistence.Id
		@GeneratedValue (strategy = GenerationType.AUTO)
		private int Id;
		private String Ename;
		private int fee;
		private int num;
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getEname() {
			return Ename;
		}
		public void setEname(String ename) {
			Ename = ename;
		}
		public int getFee() {
			return fee;
		}
		public void setFee(int fee) {
			this.fee = fee;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public studentdetails(int id, String ename, int fee, int num) {
			super();
			Id = id;
			Ename = ename;
			this.fee = fee;
			this.num = num;
		}
		public studentdetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "student [Id=" + Id + ", Ename=" + Ename + ", fee=" + fee + ", num=" + num + "]";
		}
		
		
	}
