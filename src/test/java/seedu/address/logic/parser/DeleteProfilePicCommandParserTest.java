package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;

import org.junit.Test;

import seedu.address.logic.commands.DeleteProfilePicCommand;

//@@author soonwj
/**
 * As we are only doing white-box testing, our test cases do not cover path variations
 * outside of the DeleteProfilePicCommand code. For example, inputs "1" and "1 abc" take the
 * same path through the DeleteCommand, and therefore we test only one of them.
 * The path variation for those two cases occur inside the ParserUtil, and
 * therefore should be covered by the ParserUtilTest.
 */
public class DeleteProfilePicCommandParserTest {
    private DeleteProfilePicCommandParser parser = new DeleteProfilePicCommandParser();

    @Test
    public void parse_validArgs_returnsDeleteProfilePicCommand() {
        assertParseSuccess(parser, "1", new DeleteProfilePicCommand(INDEX_FIRST_PERSON));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                DeleteProfilePicCommand.MESSAGE_USAGE));
    }
}
