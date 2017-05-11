package jp.tsite.tsutaya_passport.dapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("mfr100")
public class Mfr100 {

	@GET
	@Path("selection")
	@Produces(MediaType.APPLICATION_JSON)
	public TPMember selection(){
		
		TPMember member = new TPMember();
		member.setShopCode("0000");
		member.setTMemberNumber("9014000000000000");
		
		return member;
	}
}
