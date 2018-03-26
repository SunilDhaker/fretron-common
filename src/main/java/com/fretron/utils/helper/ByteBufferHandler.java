package com.fretron.utils.helper;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * Created by Mohit on 11-12-2017.
 */
public class ByteBufferHandler {

    private static final char[] HEXDUMP_TABLE = new char[256 * 4];

    public ByteBufferHandler(){

    }


    static {
        final char[] DIGITS = "0123456789abcdef".toCharArray();
        for (int i = 0; i < 256; i ++) {
            HEXDUMP_TABLE[(i << 1) + 0] = DIGITS[i >>> 4 & 0x0F];
            HEXDUMP_TABLE[(i << 1) + 1] = DIGITS[i >>> 0 & 0x0F];
        }
    }

    public short getUnsignedByte(ByteBuffer bb) {
        return ((short) (bb.get() & 0xff));
    }

    public  void putUnsignedByte(ByteBuffer bb, int value) {
        bb.put((byte) (value & 0xff));
    }

    public short getUnsignedByte(ByteBuffer bb, int position) {
        return ((short) (bb.get(position) & (short) 0xff));
    }

    public void putUnsignedByte(ByteBuffer bb, int position, int value) {
        bb.put(position, (byte) (value & 0xff));
    }



    public  int getUnsignedShort(ByteBuffer bb) {

        return (bb.getShort() & 0xffff);
    }

    public void putUnsignedShort(ByteBuffer bb, int value) {
        bb.putShort((short) (value & 0xffff));
    }

    public int getUnsignedShort(ByteBuffer bb, int position) {
        return (bb.getShort(position) & 0xffff);
    }

    public void putUnsignedShort(ByteBuffer bb, int position, int value) {
        bb.putShort(position, (short) (value & 0xffff));
    }


    public long getUnsignedInt(ByteBuffer bb) {
        return ((long) bb.getInt() & 0xffffffffL);
    }


    public void putUnsignedInt(ByteBuffer bb, long value) {
        bb.putInt((int) (value & 0xffffffffL));
    }

    public long getUnsignedInt(ByteBuffer bb, int position) {
        return ((long) bb.getInt(position) & 0xffffffffL);
    }

    public void putUnsignedInt(ByteBuffer bb, int position, long value) {
        bb.putInt(position, (int) (value & 0xffffffffL));
    }

    public byte[] getUnReadableByteArray(ByteBuffer buffer){
        if (buffer.hasArray()) {
            final byte[] array = buffer.array();
            final int arrayOffset = buffer.arrayOffset();
            return Arrays.copyOfRange(array, arrayOffset + buffer.position(),
                    arrayOffset + buffer.limit());
        }

        return null;
    }

    /**
     *
     * @param buffer
     * @param from starting index
     * @param length starting index + length
     * @return
     * @throws Exception ArrayIndexOutOfBoundsException
     */
   public byte [] get(ByteBuffer buffer ,int from ,int length){
        if (buffer.hasArray()){
            final byte[] array = buffer.array();
            final int arrayOffset = buffer.arrayOffset();
            return Arrays.copyOfRange(array, arrayOffset +from,
                    arrayOffset+from + length);
        }
        return null;
   }

    public ByteBuffer readBytes(ByteBuffer buffer ,int index){
        if (buffer.remaining() >= index && buffer.hasArray()){
            final int arrayOffset = buffer.arrayOffset();
            final byte[] array =  Arrays.copyOfRange(buffer.array() ,arrayOffset + buffer.position() ,arrayOffset + index + buffer.position());
            return ByteBuffer.wrap(array) ;
        }
        return null;
    }






    /**
     * Returns a <a href="http://en.wikipedia.org/wiki/Hex_dump">hex dump</a>
     * of the specified buffer's readable bytes.
     */
    public String hexDump(ByteBuffer buffer) {
        return hexDump(buffer, buffer.position(), buffer.remaining());
    }

    /**
     * Returns a <a href="http://en.wikipedia.org/wiki/Hex_dump">hex dump</a>
     * of the specified buffer's sub-region.
     */


    public  String hexDump(ByteBuffer buffer, int fromIndex, int length) {
        if (length < 0) {
            throw new IllegalArgumentException("length: " + length);
        }
        if (length == 0) {
            return "";
        }

        int endIndex = fromIndex + length;
        char[] buf = new char[length << 1];

        int srcIdx = fromIndex;
        int dstIdx = 0;
        for (; srcIdx < endIndex; srcIdx ++, dstIdx += 2) {
            System.arraycopy(
                    HEXDUMP_TABLE, getUnsignedByte(buffer,srcIdx) << 1,
                    buf, dstIdx, 2);
        }

        return new String(buf);
    }







}
