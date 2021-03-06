/**
 *
 */
package scm3Mus;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;

/**
 * This interface is used so that all different SCM3LT formats in different games
 * can be ripped using the same main class
 */
interface SCM3LT
{
    final static int MAX_TRACK_COUNT = 16;

    boolean init() throws IOException, InvalidMidiDataException;
    void process_event(int track) throws IOException, InvalidMidiDataException;
}
