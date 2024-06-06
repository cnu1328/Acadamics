package remote;

public class RemoteControls implements Controls {

    public boolean checkSwichedOn = false;
    @Override
    public String switchOn() {
    	checkSwichedOn = true;
    	return "Welcome to TATA SKY";
    }
    
    @Override
    public String switchOff() {
    	checkSwichedOn = false;
    	return "TV Switching off...";
    }
    
    @Override
    public String spc() {
    	return "STAR SPORTS CHANNEL";
    }
    
    @Override
    public String ngc() {
    	return "NGC CHANNEL";
    }
    
    @Override
    public String dc() {
    	return "DISCOVERY CHANNEL";
    }
    
    @Override
    public String smc() {
    	return "STARMOVIES CHANNEL";
    }
    
    
}
