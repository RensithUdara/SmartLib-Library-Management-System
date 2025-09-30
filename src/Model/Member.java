package Model;


public class Member extends Manage {
    @Override
    public String getName(){
    return name;
    }

    MembershipCard msc = new MembershipCard();
    private String name;
    private String contactNum;
    private String memberId;
    private int expireDate;
    private int cardNum;
    private String memberType;

    public Member(String name, String contactNum, String memberType) {
        this.name = name;
        this.contactNum = contactNum;
        this.memberType = memberType;
        expireDate = msc.expireDate();
        cardNum = msc.cardNum();

    }

    public String getContactNum() {
        return contactNum;
    }

    public String getMemberId() {
        return memberId;
    }
   
    public int getExpireDate() {
        return expireDate;
    }
    
    public String getType() {
        return memberType;
    }

    public int getCardNum() {
        return cardNum;
    }

}
