package com.xworkz.tvchannelapp.dao;

import com.xworkz.tvchannelapp.entity.TvChannel;

public interface TvChannelDAO {
	public void saveChannel(TvChannel channel);
	public TvChannel getChannelById(int channelId);
	public void updateChannelPriceById(int channelId,double price);
}
