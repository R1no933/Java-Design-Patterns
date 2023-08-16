package patterns.behavioral_patterns.iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        ChannelCollection channels = popularChannels();

        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Channel channel = baseIterator.next();
            System.out.println(channel.toString());
        }

        System.out.println("==============================");

        ChannelIterator engIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while (engIterator.hasNext()) {
            Channel channel = engIterator.next();
            System.out.println(channel.toString());
        }

        System.out.println("==============================");

        ChannelIterator ruIterator = channels.iterator(ChannelTypeEnum.RUSSIAN);
        while (ruIterator.hasNext()) {
            Channel channel = ruIterator.next();
            System.out.println(channel.toString());
        }
    }

    private static ChannelCollection popularChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();

        channels.addChannel(new Channel(99.6, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.9, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(101.1, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(103.0, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(104.0, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.1, ChannelTypeEnum.RUSSIAN));
        channels.addChannel(new Channel(105.6, ChannelTypeEnum.RUSSIAN));
        channels.addChannel(new Channel(106.0, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.2, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(106.6, ChannelTypeEnum.RUSSIAN));
        channels.addChannel(new Channel(106.9, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(107.0, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(107.2, ChannelTypeEnum.RUSSIAN));
        channels.addChannel(new Channel(107.3, ChannelTypeEnum.ENGLISH));

        return channels;
    }
}
