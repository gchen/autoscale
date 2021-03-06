package no.uio.master.autoscale.host;

import no.uio.master.autoscale.config.Config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author andreas
 */
public class CassandraHost implements Host {
	private static Logger LOG = LoggerFactory.getLogger(CassandraHost.class);
	private static final Integer DEFAULT_PORT = Config.agent_default_jmx_port;
	
	private String host;
	private Integer port;

	public CassandraHost(String host) {
		LOG.debug("Init CassandraHost {}:{}",host,DEFAULT_PORT);
		this.host = host;
		this.port = DEFAULT_PORT;
	}
	
	public CassandraHost(String host, Integer port) {
		LOG.debug("Init CassandraHost {}:{}",host,port);
		this.host = host;
		this.port = port;
	}

	@Override
	public String getHost() {
		return this.host;
	}

	@Override
	public String getIp() {
		return this.host;
	}

	@Override
	public Integer getPort() {
		return this.port;
	}

	@Override
	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public void setPort(Integer port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "CassandraHost [host=" + host + ", port=" + port + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((host == null) ? 0 : host.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CassandraHost other = (CassandraHost) obj;
		if (host == null) {
			if (other.host != null)
				return false;
		} else if (!host.equals(other.host))
			return false;
		return true;
	}
	
}
