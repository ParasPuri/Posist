/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Posist {
    private static int count = 1;
    //private static long 
    class Node{
        private String data;
        private int nodeNumber;
        private String nodeId;
        private String referenceNodeId;
        private String childReferenceNodeId;
        private String genesisReferenceNodeId;
        private String hashValue;
        private Date timestamp;
        private String encryption;
        
        
        public Node(){
            
          setNodeNumber(count+1);
          setTimestamp();
          setNodeId();
            
        }
            
        //getter and setters
        
        public String getChildReferenceNodeId() {
            return childReferenceNodeId;
        }

        public void setChildReferenceNodeId(String childReferenceNodeId) {
            this.childReferenceNodeId = childReferenceNodeId;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
        
        private String encryption(){
       
    }

        public String getGenesisReferenceNodeId() {
            return genesisReferenceNodeId;
        }

        public void setGenesisReferenceNodeId(String genesisReferenceNodeId) {
            this.genesisReferenceNodeId = genesisReferenceNodeId;
        }

        public String getHashValue() {
           
            return ""+hashCode();
        }

//        public void setHashValue(String hashValue) {
//            this.hashValue = hashValue;
//        }
        
        private String uniqueID()  // generating Unique ID
        {
            UUID uuid= UUID.randomUUID();
            return ""+uuid;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public int getNodeNumber() {
            return nodeNumber;
        }

        public void setNodeNumber(int nodeNumber) {
            this.nodeNumber = nodeNumber;
        }

        public String getReferenceNodeId() {
            return referenceNodeId;
        }

        public void setReferenceNodeId(String referenceNodeId) {
            this.referenceNodeId = referenceNodeId;
        }

        public Date getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Date timestamp) {
            DateFormat dateFormat =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date= new Date();
            this.timestamp = dateFormat.format(date);
        }
        
        
    }
    private void makeGenesis(Node node)
    {
        node.setReferenceNodeId(null);
        
    }
    public void createNode()
    {
      Node node= new Node();
      if(node.nodeNumber == 1)
      {
          makeGenesis(node);
      }
    }
    
    
    
    public static void main(String[] args)
    {
        
    }

    
}
