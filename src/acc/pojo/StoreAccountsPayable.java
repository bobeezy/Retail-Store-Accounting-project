package acc.pojo;

import java.util.Date;

@Entity
@Table(name = "CustomerPayments")
public class StoreAccountsPayable {

	@Id
	@GeneratedValue
	@Column(name = "AccPayableID")
	private long accPaymentID;
	
	@Column(name = "AccountType")
	private String accType;
	
	@Column(name = "Amount")
	private double amount;
	
	@Column(name = "PaymentDate")
	private Date paymentDate;
	
	@Column(name = "PaymentDate")
	private Date paymentDate;
	
	/*Relationship*/
	
	
	
	
	
	
	
}
