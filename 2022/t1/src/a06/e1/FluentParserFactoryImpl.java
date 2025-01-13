package a06.e1;

import java.util.List;
import java.util.function.UnaryOperator;

public class FluentParserFactoryImpl implements FluentParserFactory{

    @Override
    public FluentParser<Integer> naturals() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'naturals'");
    }

    @Override
    public FluentParser<List<Integer>> incrementalNaturalLists() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incrementalNaturalLists'");
    }

    @Override
    public FluentParser<Integer> repetitiveIncrementalNaturals() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'repetitiveIncrementalNaturals'");
    }

    @Override
    public FluentParser<String> repetitiveIncrementalStrings(String s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'repetitiveIncrementalStrings'");
    }

    @Override
    public FluentParser<Pair<Integer, List<String>>> incrementalPairs(int i0, UnaryOperator<Integer> op, String s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incrementalPairs'");
    }

}
