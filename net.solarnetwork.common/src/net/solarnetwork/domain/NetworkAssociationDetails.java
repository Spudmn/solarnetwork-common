/* ==================================================================
 * NetworkAssociationDetails.java - Sep 6, 2011 8:04:08 PM
 * 
 * Copyright 2007-2011 SolarNetwork.net Dev Team
 * 
 * This program is free software; you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as 
 * published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License 
 * along with this program; if not, write to the Free Software 
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 
 * 02111-1307 USA
 * ==================================================================
 * $Id$
 * ==================================================================
 */

package net.solarnetwork.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Command object for initial SolarNode and SolarNet association data.
 * 
 * @author matt
 * @version 1.0
 */
public class NetworkAssociationDetails extends BasicNetworkIdentity implements NetworkIdentity,
		Serializable {

	private static final long serialVersionUID = 6959315661640228127L;

	private String confirmationKey;
	private Long nodeId;
	private String username;
	private Date expiration;
	private String securityPhrase;

	@Override
	public String toString() {
		return "NetworkAssociationDetails{nodeId=" + nodeId + ",username=" + username + '}';
	}

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public String getConfirmationKey() {
		return confirmationKey;
	}

	public void setConfirmationKey(String confirmationKey) {
		this.confirmationKey = confirmationKey;
	}

	public String getSecurityPhrase() {
		return securityPhrase;
	}

	public void setSecurityPhrase(String secretPhrase) {
		this.securityPhrase = secretPhrase;
	}

}
