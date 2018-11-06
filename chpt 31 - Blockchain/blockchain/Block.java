package blockchain;

import java.util.Date;

public class Block {
	
	public String hash;
	public String previousHash; 
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	private int nonce;
	
	//Block Constructor.  
	public Block(String data,String previousHash ) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash(); //Making sure we do this after we set the other values.
		System.out.println("Block has been created - Hash : " + hash);
	}
	
	//Calculate new hash based on blocks contents
	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256( 
				previousHash +
				Long.toString(timeStamp) +
				Integer.toString(nonce) + 
				data 
				);
		return calculatedhash;
	}
	
	public void calculateFakeHash() {
		String calculatedFakeHash = "fakefakefakefakefakefakefakefakefakefakefakefakefakefakefkafakef";
		hash = calculatedFakeHash;
		
	}
	
	//Increases nonce value until hash target is reached.
	public void mineBlock(int difficulty) {
		System.out.println("Mining block...");
		String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
		while(!hash.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hash = calculateHash();
			}
		System.out.println("Block Mined!!! - Rewriting hash: " + hash);
	}
	
}