package com.example.ExamMongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Reservation")                        // Name of the collection inside the RRdb database
public class RailwayReservation {

		@Id
		private String pnrNo;                         // pnrNo as id
		private String passengerName;
		private String sourceLocation;
		private String destLocation;
		private double price;
		
		public RailwayReservation() {                   //default constructor
			super();
			
		}

		public RailwayReservation(String pnrNo, String passengerName,                    //parameterized constructor
				String sourceLocation, String destLocation, double price) {
			super();
			this.pnrNo = pnrNo;
			this.passengerName = passengerName;
			this.sourceLocation = sourceLocation;
			this.destLocation = destLocation;
			this.price = price;
		}

		//Getters and setters
		
		public String getPnrNo() {
			return pnrNo;
		}

		public void setPnrNo(String pnrNo) {
			this.pnrNo = pnrNo;
		}

		public String getPassengerName() {
			return passengerName;
		}

		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}

		public String getSourceLocation() {
			return sourceLocation;
		}

		public void setSourceLocation(String sourceLocation) {
			this.sourceLocation = sourceLocation;
		}

		public String getDestLocation() {
			return destLocation;
		}

		public void setDestLocation(String destLocation) {
			this.destLocation = destLocation;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		
		//toString method
		
		@Override
		public String toString() {
			return "RailwayReservation [pnrNo=" + pnrNo + ", passengerName="
					+ passengerName + ", sourceLocation=" + sourceLocation
					+ ", destLocation=" + destLocation + ", price=" + price
					+ "]";
		}
		
}
