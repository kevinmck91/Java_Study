package blockchain_part_1;

import java.security.Security;
import java.util.ArrayList;
import java.util.Base64;
import com.google.gson.GsonBuilder;

public class NoobChain {
	
	public static ArrayList<Block> blockchain = new ArrayList<Block>();
	public static int difficulty = 1;

	public static void main(String[] args) {	
		//add our blocks to the blockchain ArrayList:
		
		System.out.println("\n Trying to Mine block 1... ");
		Block block1 = new Block("Hi im the first block", "0");
		addBlock(block1); 	// Create an initial block, mine it, add it to the block chain
		
		System.out.println("\n Trying to Mine block 2... ");
		Block block2 = new Block("Yo im the second block",blockchain.get(blockchain.size()-1).hash);
		addBlock(block2);
				
		System.out.println(" \nTrying to Mine block 3... ");
		addBlock(new Block("Hey im the third block",blockchain.get(blockchain.size()-1).hash));	
		
		System.out.println("\n Tampering with block 2");
		blockchain.get(1).calculateFakeHash();
		
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		// Converting Blockchain to JSON
		String blockchainJson = StringUtil.getJson(blockchain);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson);
	}
	
	public static void addBlock(Block newBlock) {
		newBlock.mineBlock(difficulty);
		blockchain.add(newBlock);
	}
	
	public static Boolean isChainValid() {
		Block currentBlock; 
		Block previousBlock;
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		
		//loop through blockchain to check hashes:
		for(int i=1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hash is solved
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
			
		}
		return true;
	}
	

}