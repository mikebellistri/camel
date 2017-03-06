package org.apache.camel.component.aws.sns;

import org.apache.camel.impl.DefaultHeaderFilterStrategy;

public class SnsHeaderFilterStrategy extends DefaultHeaderFilterStrategy {
	public SnsHeaderFilterStrategy(){ initialize();}

	private void initialize() {
		// filter headers begin with "Camel" or "org.apache.camel"
		setOutFilterPattern("(Camel|org\\.apache\\.camel)[\\.|a-z|A-z|0-9]*");
	}
}
