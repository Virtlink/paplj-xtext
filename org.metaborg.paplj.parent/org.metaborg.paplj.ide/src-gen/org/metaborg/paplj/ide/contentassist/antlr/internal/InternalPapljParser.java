package org.metaborg.paplj.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.metaborg.paplj.services.PapljGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPapljParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'program'", "';'", "'run'", "'.'", "'.*'", "'import'", "'class'", "'{'", "'}'", "'extends'", "'('", "')'", "','", "'='", "'||'", "'&&'", "'=='", "'!='", "'<'", "'+'", "'-'", "'*'", "'/'", "'as'", "'!'", "'this'", "'null'", "'new'", "'if'", "'else'", "'let'", "'in'", "'true'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPapljParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPapljParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPapljParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPaplj.g"; }


    	private PapljGrammarAccess grammarAccess;

    	public void setGrammarAccess(PapljGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalPaplj.g:54:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalPaplj.g:55:1: ( ruleProgram EOF )
            // InternalPaplj.g:56:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalPaplj.g:63:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:67:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalPaplj.g:68:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalPaplj.g:68:2: ( ( rule__Program__Group__0 ) )
            // InternalPaplj.g:69:3: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // InternalPaplj.g:70:3: ( rule__Program__Group__0 )
            // InternalPaplj.g:70:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalPaplj.g:79:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalPaplj.g:80:1: ( ruleQualifiedName EOF )
            // InternalPaplj.g:81:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalPaplj.g:88:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:92:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalPaplj.g:93:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalPaplj.g:93:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalPaplj.g:94:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalPaplj.g:95:3: ( rule__QualifiedName__Group__0 )
            // InternalPaplj.g:95:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalPaplj.g:104:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalPaplj.g:105:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalPaplj.g:106:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalPaplj.g:113:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:117:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalPaplj.g:118:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalPaplj.g:118:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalPaplj.g:119:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalPaplj.g:120:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalPaplj.g:120:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalPaplj.g:129:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalPaplj.g:130:1: ( ruleImport EOF )
            // InternalPaplj.g:131:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalPaplj.g:138:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:142:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalPaplj.g:143:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalPaplj.g:143:2: ( ( rule__Import__Group__0 ) )
            // InternalPaplj.g:144:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalPaplj.g:145:3: ( rule__Import__Group__0 )
            // InternalPaplj.g:145:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // InternalPaplj.g:154:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalPaplj.g:155:1: ( ruleType EOF )
            // InternalPaplj.g:156:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalPaplj.g:163:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:167:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalPaplj.g:168:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalPaplj.g:168:2: ( ( rule__Type__Group__0 ) )
            // InternalPaplj.g:169:3: ( rule__Type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGroup()); 
            }
            // InternalPaplj.g:170:3: ( rule__Type__Group__0 )
            // InternalPaplj.g:170:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMember"
    // InternalPaplj.g:179:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalPaplj.g:180:1: ( ruleMember EOF )
            // InternalPaplj.g:181:1: ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalPaplj.g:188:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:192:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalPaplj.g:193:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalPaplj.g:193:2: ( ( rule__Member__Alternatives ) )
            // InternalPaplj.g:194:3: ( rule__Member__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getAlternatives()); 
            }
            // InternalPaplj.g:195:3: ( rule__Member__Alternatives )
            // InternalPaplj.g:195:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // InternalPaplj.g:204:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalPaplj.g:205:1: ( ruleField EOF )
            // InternalPaplj.g:206:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalPaplj.g:213:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:217:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalPaplj.g:218:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalPaplj.g:218:2: ( ( rule__Field__Group__0 ) )
            // InternalPaplj.g:219:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalPaplj.g:220:3: ( rule__Field__Group__0 )
            // InternalPaplj.g:220:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalPaplj.g:229:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalPaplj.g:230:1: ( ruleMethod EOF )
            // InternalPaplj.g:231:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalPaplj.g:238:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:242:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalPaplj.g:243:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalPaplj.g:243:2: ( ( rule__Method__Group__0 ) )
            // InternalPaplj.g:244:3: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // InternalPaplj.g:245:3: ( rule__Method__Group__0 )
            // InternalPaplj.g:245:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParam"
    // InternalPaplj.g:254:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalPaplj.g:255:1: ( ruleParam EOF )
            // InternalPaplj.g:256:1: ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalPaplj.g:263:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:267:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalPaplj.g:268:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalPaplj.g:268:2: ( ( rule__Param__Group__0 ) )
            // InternalPaplj.g:269:3: ( rule__Param__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getGroup()); 
            }
            // InternalPaplj.g:270:3: ( rule__Param__Group__0 )
            // InternalPaplj.g:270:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleBinding"
    // InternalPaplj.g:279:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalPaplj.g:280:1: ( ruleBinding EOF )
            // InternalPaplj.g:281:1: ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalPaplj.g:288:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:292:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalPaplj.g:293:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalPaplj.g:293:2: ( ( rule__Binding__Group__0 ) )
            // InternalPaplj.g:294:3: ( rule__Binding__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getGroup()); 
            }
            // InternalPaplj.g:295:3: ( rule__Binding__Group__0 )
            // InternalPaplj.g:295:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBlock2"
    // InternalPaplj.g:304:1: entryRuleBlock2 : ruleBlock2 EOF ;
    public final void entryRuleBlock2() throws RecognitionException {
        try {
            // InternalPaplj.g:305:1: ( ruleBlock2 EOF )
            // InternalPaplj.g:306:1: ruleBlock2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlock2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock2"


    // $ANTLR start "ruleBlock2"
    // InternalPaplj.g:313:1: ruleBlock2 : ( ( rule__Block2__Group__0 ) ) ;
    public final void ruleBlock2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:317:2: ( ( ( rule__Block2__Group__0 ) ) )
            // InternalPaplj.g:318:2: ( ( rule__Block2__Group__0 ) )
            {
            // InternalPaplj.g:318:2: ( ( rule__Block2__Group__0 ) )
            // InternalPaplj.g:319:3: ( rule__Block2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getGroup()); 
            }
            // InternalPaplj.g:320:3: ( rule__Block2__Group__0 )
            // InternalPaplj.g:320:4: rule__Block2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock2"


    // $ANTLR start "entryRuleExpr"
    // InternalPaplj.g:329:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:330:1: ( ruleExpr EOF )
            // InternalPaplj.g:331:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalPaplj.g:338:1: ruleExpr : ( ruleIfLetExpr ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:342:2: ( ( ruleIfLetExpr ) )
            // InternalPaplj.g:343:2: ( ruleIfLetExpr )
            {
            // InternalPaplj.g:343:2: ( ruleIfLetExpr )
            // InternalPaplj.g:344:3: ruleIfLetExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getIfLetExprParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleIfLetExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getIfLetExprParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleIfLetExpr"
    // InternalPaplj.g:354:1: entryRuleIfLetExpr : ruleIfLetExpr EOF ;
    public final void entryRuleIfLetExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:355:1: ( ruleIfLetExpr EOF )
            // InternalPaplj.g:356:1: ruleIfLetExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfLetExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfLetExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfLetExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfLetExpr"


    // $ANTLR start "ruleIfLetExpr"
    // InternalPaplj.g:363:1: ruleIfLetExpr : ( ( rule__IfLetExpr__Alternatives ) ) ;
    public final void ruleIfLetExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:367:2: ( ( ( rule__IfLetExpr__Alternatives ) ) )
            // InternalPaplj.g:368:2: ( ( rule__IfLetExpr__Alternatives ) )
            {
            // InternalPaplj.g:368:2: ( ( rule__IfLetExpr__Alternatives ) )
            // InternalPaplj.g:369:3: ( rule__IfLetExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfLetExprAccess().getAlternatives()); 
            }
            // InternalPaplj.g:370:3: ( rule__IfLetExpr__Alternatives )
            // InternalPaplj.g:370:4: rule__IfLetExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IfLetExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfLetExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfLetExpr"


    // $ANTLR start "entryRuleAssignmentExpr"
    // InternalPaplj.g:379:1: entryRuleAssignmentExpr : ruleAssignmentExpr EOF ;
    public final void entryRuleAssignmentExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:380:1: ( ruleAssignmentExpr EOF )
            // InternalPaplj.g:381:1: ruleAssignmentExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignmentExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignmentExpr"


    // $ANTLR start "ruleAssignmentExpr"
    // InternalPaplj.g:388:1: ruleAssignmentExpr : ( ( rule__AssignmentExpr__Group__0 ) ) ;
    public final void ruleAssignmentExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:392:2: ( ( ( rule__AssignmentExpr__Group__0 ) ) )
            // InternalPaplj.g:393:2: ( ( rule__AssignmentExpr__Group__0 ) )
            {
            // InternalPaplj.g:393:2: ( ( rule__AssignmentExpr__Group__0 ) )
            // InternalPaplj.g:394:3: ( rule__AssignmentExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExprAccess().getGroup()); 
            }
            // InternalPaplj.g:395:3: ( rule__AssignmentExpr__Group__0 )
            // InternalPaplj.g:395:4: rule__AssignmentExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignmentExpr"


    // $ANTLR start "entryRuleLogicalOrExpr"
    // InternalPaplj.g:404:1: entryRuleLogicalOrExpr : ruleLogicalOrExpr EOF ;
    public final void entryRuleLogicalOrExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:405:1: ( ruleLogicalOrExpr EOF )
            // InternalPaplj.g:406:1: ruleLogicalOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogicalOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalOrExpr"


    // $ANTLR start "ruleLogicalOrExpr"
    // InternalPaplj.g:413:1: ruleLogicalOrExpr : ( ( rule__LogicalOrExpr__Group__0 ) ) ;
    public final void ruleLogicalOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:417:2: ( ( ( rule__LogicalOrExpr__Group__0 ) ) )
            // InternalPaplj.g:418:2: ( ( rule__LogicalOrExpr__Group__0 ) )
            {
            // InternalPaplj.g:418:2: ( ( rule__LogicalOrExpr__Group__0 ) )
            // InternalPaplj.g:419:3: ( rule__LogicalOrExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExprAccess().getGroup()); 
            }
            // InternalPaplj.g:420:3: ( rule__LogicalOrExpr__Group__0 )
            // InternalPaplj.g:420:4: rule__LogicalOrExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOrExpr"


    // $ANTLR start "entryRuleLogicalAndExpr"
    // InternalPaplj.g:429:1: entryRuleLogicalAndExpr : ruleLogicalAndExpr EOF ;
    public final void entryRuleLogicalAndExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:430:1: ( ruleLogicalAndExpr EOF )
            // InternalPaplj.g:431:1: ruleLogicalAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogicalAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalAndExpr"


    // $ANTLR start "ruleLogicalAndExpr"
    // InternalPaplj.g:438:1: ruleLogicalAndExpr : ( ( rule__LogicalAndExpr__Group__0 ) ) ;
    public final void ruleLogicalAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:442:2: ( ( ( rule__LogicalAndExpr__Group__0 ) ) )
            // InternalPaplj.g:443:2: ( ( rule__LogicalAndExpr__Group__0 ) )
            {
            // InternalPaplj.g:443:2: ( ( rule__LogicalAndExpr__Group__0 ) )
            // InternalPaplj.g:444:3: ( rule__LogicalAndExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExprAccess().getGroup()); 
            }
            // InternalPaplj.g:445:3: ( rule__LogicalAndExpr__Group__0 )
            // InternalPaplj.g:445:4: rule__LogicalAndExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAndExpr"


    // $ANTLR start "entryRuleComparativeExpr"
    // InternalPaplj.g:454:1: entryRuleComparativeExpr : ruleComparativeExpr EOF ;
    public final void entryRuleComparativeExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:455:1: ( ruleComparativeExpr EOF )
            // InternalPaplj.g:456:1: ruleComparativeExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparativeExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparativeExpr"


    // $ANTLR start "ruleComparativeExpr"
    // InternalPaplj.g:463:1: ruleComparativeExpr : ( ( rule__ComparativeExpr__Group__0 ) ) ;
    public final void ruleComparativeExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:467:2: ( ( ( rule__ComparativeExpr__Group__0 ) ) )
            // InternalPaplj.g:468:2: ( ( rule__ComparativeExpr__Group__0 ) )
            {
            // InternalPaplj.g:468:2: ( ( rule__ComparativeExpr__Group__0 ) )
            // InternalPaplj.g:469:3: ( rule__ComparativeExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getGroup()); 
            }
            // InternalPaplj.g:470:3: ( rule__ComparativeExpr__Group__0 )
            // InternalPaplj.g:470:4: rule__ComparativeExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparativeExpr"


    // $ANTLR start "entryRuleAdditiveExpr"
    // InternalPaplj.g:479:1: entryRuleAdditiveExpr : ruleAdditiveExpr EOF ;
    public final void entryRuleAdditiveExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:480:1: ( ruleAdditiveExpr EOF )
            // InternalPaplj.g:481:1: ruleAdditiveExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdditiveExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditiveExpr"


    // $ANTLR start "ruleAdditiveExpr"
    // InternalPaplj.g:488:1: ruleAdditiveExpr : ( ( rule__AdditiveExpr__Group__0 ) ) ;
    public final void ruleAdditiveExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:492:2: ( ( ( rule__AdditiveExpr__Group__0 ) ) )
            // InternalPaplj.g:493:2: ( ( rule__AdditiveExpr__Group__0 ) )
            {
            // InternalPaplj.g:493:2: ( ( rule__AdditiveExpr__Group__0 ) )
            // InternalPaplj.g:494:3: ( rule__AdditiveExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprAccess().getGroup()); 
            }
            // InternalPaplj.g:495:3: ( rule__AdditiveExpr__Group__0 )
            // InternalPaplj.g:495:4: rule__AdditiveExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveExpr"


    // $ANTLR start "entryRuleMultiplicativeExpr"
    // InternalPaplj.g:504:1: entryRuleMultiplicativeExpr : ruleMultiplicativeExpr EOF ;
    public final void entryRuleMultiplicativeExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:505:1: ( ruleMultiplicativeExpr EOF )
            // InternalPaplj.g:506:1: ruleMultiplicativeExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeExpr"


    // $ANTLR start "ruleMultiplicativeExpr"
    // InternalPaplj.g:513:1: ruleMultiplicativeExpr : ( ( rule__MultiplicativeExpr__Group__0 ) ) ;
    public final void ruleMultiplicativeExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:517:2: ( ( ( rule__MultiplicativeExpr__Group__0 ) ) )
            // InternalPaplj.g:518:2: ( ( rule__MultiplicativeExpr__Group__0 ) )
            {
            // InternalPaplj.g:518:2: ( ( rule__MultiplicativeExpr__Group__0 ) )
            // InternalPaplj.g:519:3: ( rule__MultiplicativeExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprAccess().getGroup()); 
            }
            // InternalPaplj.g:520:3: ( rule__MultiplicativeExpr__Group__0 )
            // InternalPaplj.g:520:4: rule__MultiplicativeExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalPaplj.g:529:1: entryRuleUnaryExpr : ruleUnaryExpr EOF ;
    public final void entryRuleUnaryExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:530:1: ( ruleUnaryExpr EOF )
            // InternalPaplj.g:531:1: ruleUnaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalPaplj.g:538:1: ruleUnaryExpr : ( ( rule__UnaryExpr__Alternatives ) ) ;
    public final void ruleUnaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:542:2: ( ( ( rule__UnaryExpr__Alternatives ) ) )
            // InternalPaplj.g:543:2: ( ( rule__UnaryExpr__Alternatives ) )
            {
            // InternalPaplj.g:543:2: ( ( rule__UnaryExpr__Alternatives ) )
            // InternalPaplj.g:544:3: ( rule__UnaryExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getAlternatives()); 
            }
            // InternalPaplj.g:545:3: ( rule__UnaryExpr__Alternatives )
            // InternalPaplj.g:545:4: rule__UnaryExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleMemberExpr"
    // InternalPaplj.g:554:1: entryRuleMemberExpr : ruleMemberExpr EOF ;
    public final void entryRuleMemberExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:555:1: ( ruleMemberExpr EOF )
            // InternalPaplj.g:556:1: ruleMemberExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMemberExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberExpr"


    // $ANTLR start "ruleMemberExpr"
    // InternalPaplj.g:563:1: ruleMemberExpr : ( ( rule__MemberExpr__Group__0 ) ) ;
    public final void ruleMemberExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:567:2: ( ( ( rule__MemberExpr__Group__0 ) ) )
            // InternalPaplj.g:568:2: ( ( rule__MemberExpr__Group__0 ) )
            {
            // InternalPaplj.g:568:2: ( ( rule__MemberExpr__Group__0 ) )
            // InternalPaplj.g:569:3: ( rule__MemberExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getGroup()); 
            }
            // InternalPaplj.g:570:3: ( rule__MemberExpr__Group__0 )
            // InternalPaplj.g:570:4: rule__MemberExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberExpr"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalPaplj.g:579:1: entryRulePrimaryExpr : rulePrimaryExpr EOF ;
    public final void entryRulePrimaryExpr() throws RecognitionException {
        try {
            // InternalPaplj.g:580:1: ( rulePrimaryExpr EOF )
            // InternalPaplj.g:581:1: rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalPaplj.g:588:1: rulePrimaryExpr : ( ( rule__PrimaryExpr__Alternatives ) ) ;
    public final void rulePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:592:2: ( ( ( rule__PrimaryExpr__Alternatives ) ) )
            // InternalPaplj.g:593:2: ( ( rule__PrimaryExpr__Alternatives ) )
            {
            // InternalPaplj.g:593:2: ( ( rule__PrimaryExpr__Alternatives ) )
            // InternalPaplj.g:594:3: ( rule__PrimaryExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getAlternatives()); 
            }
            // InternalPaplj.g:595:3: ( rule__PrimaryExpr__Alternatives )
            // InternalPaplj.g:595:4: rule__PrimaryExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleIf"
    // InternalPaplj.g:604:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalPaplj.g:605:1: ( ruleIf EOF )
            // InternalPaplj.g:606:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalPaplj.g:613:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:617:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalPaplj.g:618:2: ( ( rule__If__Group__0 ) )
            {
            // InternalPaplj.g:618:2: ( ( rule__If__Group__0 ) )
            // InternalPaplj.g:619:3: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // InternalPaplj.g:620:3: ( rule__If__Group__0 )
            // InternalPaplj.g:620:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleLet"
    // InternalPaplj.g:629:1: entryRuleLet : ruleLet EOF ;
    public final void entryRuleLet() throws RecognitionException {
        try {
            // InternalPaplj.g:630:1: ( ruleLet EOF )
            // InternalPaplj.g:631:1: ruleLet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalPaplj.g:638:1: ruleLet : ( ( rule__Let__Group__0 ) ) ;
    public final void ruleLet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:642:2: ( ( ( rule__Let__Group__0 ) ) )
            // InternalPaplj.g:643:2: ( ( rule__Let__Group__0 ) )
            {
            // InternalPaplj.g:643:2: ( ( rule__Let__Group__0 ) )
            // InternalPaplj.g:644:3: ( rule__Let__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetAccess().getGroup()); 
            }
            // InternalPaplj.g:645:3: ( rule__Let__Group__0 )
            // InternalPaplj.g:645:4: rule__Let__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLet"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalPaplj.g:653:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:657:1: ( ( ruleField ) | ( ruleMethod ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalPaplj.g:658:2: ( ruleField )
                    {
                    // InternalPaplj.g:658:2: ( ruleField )
                    // InternalPaplj.g:659:3: ruleField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPaplj.g:664:2: ( ruleMethod )
                    {
                    // InternalPaplj.g:664:2: ( ruleMethod )
                    // InternalPaplj.g:665:3: ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__IfLetExpr__Alternatives"
    // InternalPaplj.g:674:1: rule__IfLetExpr__Alternatives : ( ( ruleIf ) | ( ruleLet ) | ( ruleAssignmentExpr ) );
    public final void rule__IfLetExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:678:1: ( ( ruleIf ) | ( ruleLet ) | ( ruleAssignmentExpr ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt2=1;
                }
                break;
            case 42:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 11:
            case 19:
            case 22:
            case 32:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPaplj.g:679:2: ( ruleIf )
                    {
                    // InternalPaplj.g:679:2: ( ruleIf )
                    // InternalPaplj.g:680:3: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfLetExprAccess().getIfParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfLetExprAccess().getIfParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPaplj.g:685:2: ( ruleLet )
                    {
                    // InternalPaplj.g:685:2: ( ruleLet )
                    // InternalPaplj.g:686:3: ruleLet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfLetExprAccess().getLetParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfLetExprAccess().getLetParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPaplj.g:691:2: ( ruleAssignmentExpr )
                    {
                    // InternalPaplj.g:691:2: ( ruleAssignmentExpr )
                    // InternalPaplj.g:692:3: ruleAssignmentExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfLetExprAccess().getAssignmentExprParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignmentExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfLetExprAccess().getAssignmentExprParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLetExpr__Alternatives"


    // $ANTLR start "rule__ComparativeExpr__Alternatives_1_0"
    // InternalPaplj.g:701:1: rule__ComparativeExpr__Alternatives_1_0 : ( ( ( rule__ComparativeExpr__Group_1_0_0__0 ) ) | ( ( rule__ComparativeExpr__Group_1_0_1__0 ) ) | ( ( rule__ComparativeExpr__Group_1_0_2__0 ) ) );
    public final void rule__ComparativeExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:705:1: ( ( ( rule__ComparativeExpr__Group_1_0_0__0 ) ) | ( ( rule__ComparativeExpr__Group_1_0_1__0 ) ) | ( ( rule__ComparativeExpr__Group_1_0_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPaplj.g:706:2: ( ( rule__ComparativeExpr__Group_1_0_0__0 ) )
                    {
                    // InternalPaplj.g:706:2: ( ( rule__ComparativeExpr__Group_1_0_0__0 ) )
                    // InternalPaplj.g:707:3: ( rule__ComparativeExpr__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparativeExprAccess().getGroup_1_0_0()); 
                    }
                    // InternalPaplj.g:708:3: ( rule__ComparativeExpr__Group_1_0_0__0 )
                    // InternalPaplj.g:708:4: rule__ComparativeExpr__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparativeExpr__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparativeExprAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPaplj.g:712:2: ( ( rule__ComparativeExpr__Group_1_0_1__0 ) )
                    {
                    // InternalPaplj.g:712:2: ( ( rule__ComparativeExpr__Group_1_0_1__0 ) )
                    // InternalPaplj.g:713:3: ( rule__ComparativeExpr__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparativeExprAccess().getGroup_1_0_1()); 
                    }
                    // InternalPaplj.g:714:3: ( rule__ComparativeExpr__Group_1_0_1__0 )
                    // InternalPaplj.g:714:4: rule__ComparativeExpr__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparativeExpr__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparativeExprAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPaplj.g:718:2: ( ( rule__ComparativeExpr__Group_1_0_2__0 ) )
                    {
                    // InternalPaplj.g:718:2: ( ( rule__ComparativeExpr__Group_1_0_2__0 ) )
                    // InternalPaplj.g:719:3: ( rule__ComparativeExpr__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparativeExprAccess().getGroup_1_0_2()); 
                    }
                    // InternalPaplj.g:720:3: ( rule__ComparativeExpr__Group_1_0_2__0 )
                    // InternalPaplj.g:720:4: rule__ComparativeExpr__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparativeExpr__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparativeExprAccess().getGroup_1_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Alternatives_1_0"


    // $ANTLR start "rule__AdditiveExpr__Alternatives_1_0"
    // InternalPaplj.g:728:1: rule__AdditiveExpr__Alternatives_1_0 : ( ( ( rule__AdditiveExpr__Group_1_0_0__0 ) ) | ( ( rule__AdditiveExpr__Group_1_0_1__0 ) ) );
    public final void rule__AdditiveExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:732:1: ( ( ( rule__AdditiveExpr__Group_1_0_0__0 ) ) | ( ( rule__AdditiveExpr__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPaplj.g:733:2: ( ( rule__AdditiveExpr__Group_1_0_0__0 ) )
                    {
                    // InternalPaplj.g:733:2: ( ( rule__AdditiveExpr__Group_1_0_0__0 ) )
                    // InternalPaplj.g:734:3: ( rule__AdditiveExpr__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveExprAccess().getGroup_1_0_0()); 
                    }
                    // InternalPaplj.g:735:3: ( rule__AdditiveExpr__Group_1_0_0__0 )
                    // InternalPaplj.g:735:4: rule__AdditiveExpr__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdditiveExpr__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveExprAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPaplj.g:739:2: ( ( rule__AdditiveExpr__Group_1_0_1__0 ) )
                    {
                    // InternalPaplj.g:739:2: ( ( rule__AdditiveExpr__Group_1_0_1__0 ) )
                    // InternalPaplj.g:740:3: ( rule__AdditiveExpr__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveExprAccess().getGroup_1_0_1()); 
                    }
                    // InternalPaplj.g:741:3: ( rule__AdditiveExpr__Group_1_0_1__0 )
                    // InternalPaplj.g:741:4: rule__AdditiveExpr__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdditiveExpr__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveExprAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Alternatives_1_0"


    // $ANTLR start "rule__MultiplicativeExpr__Alternatives_1_0"
    // InternalPaplj.g:749:1: rule__MultiplicativeExpr__Alternatives_1_0 : ( ( ( rule__MultiplicativeExpr__Group_1_0_0__0 ) ) | ( ( rule__MultiplicativeExpr__Group_1_0_1__0 ) ) );
    public final void rule__MultiplicativeExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:753:1: ( ( ( rule__MultiplicativeExpr__Group_1_0_0__0 ) ) | ( ( rule__MultiplicativeExpr__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPaplj.g:754:2: ( ( rule__MultiplicativeExpr__Group_1_0_0__0 ) )
                    {
                    // InternalPaplj.g:754:2: ( ( rule__MultiplicativeExpr__Group_1_0_0__0 ) )
                    // InternalPaplj.g:755:3: ( rule__MultiplicativeExpr__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExprAccess().getGroup_1_0_0()); 
                    }
                    // InternalPaplj.g:756:3: ( rule__MultiplicativeExpr__Group_1_0_0__0 )
                    // InternalPaplj.g:756:4: rule__MultiplicativeExpr__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicativeExpr__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExprAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPaplj.g:760:2: ( ( rule__MultiplicativeExpr__Group_1_0_1__0 ) )
                    {
                    // InternalPaplj.g:760:2: ( ( rule__MultiplicativeExpr__Group_1_0_1__0 ) )
                    // InternalPaplj.g:761:3: ( rule__MultiplicativeExpr__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExprAccess().getGroup_1_0_1()); 
                    }
                    // InternalPaplj.g:762:3: ( rule__MultiplicativeExpr__Group_1_0_1__0 )
                    // InternalPaplj.g:762:4: rule__MultiplicativeExpr__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicativeExpr__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExprAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Alternatives_1_0"


    // $ANTLR start "rule__UnaryExpr__Alternatives"
    // InternalPaplj.g:770:1: rule__UnaryExpr__Alternatives : ( ( ( rule__UnaryExpr__Group_0__0 ) ) | ( ( rule__UnaryExpr__Group_1__0 ) ) | ( ( rule__UnaryExpr__Group_2__0 ) ) );
    public final void rule__UnaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:774:1: ( ( ( rule__UnaryExpr__Group_0__0 ) ) | ( ( rule__UnaryExpr__Group_1__0 ) ) | ( ( rule__UnaryExpr__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case 11:
            case 19:
            case 22:
            case 37:
            case 38:
            case 39:
            case 44:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPaplj.g:775:2: ( ( rule__UnaryExpr__Group_0__0 ) )
                    {
                    // InternalPaplj.g:775:2: ( ( rule__UnaryExpr__Group_0__0 ) )
                    // InternalPaplj.g:776:3: ( rule__UnaryExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExprAccess().getGroup_0()); 
                    }
                    // InternalPaplj.g:777:3: ( rule__UnaryExpr__Group_0__0 )
                    // InternalPaplj.g:777:4: rule__UnaryExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpr__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExprAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPaplj.g:781:2: ( ( rule__UnaryExpr__Group_1__0 ) )
                    {
                    // InternalPaplj.g:781:2: ( ( rule__UnaryExpr__Group_1__0 ) )
                    // InternalPaplj.g:782:3: ( rule__UnaryExpr__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExprAccess().getGroup_1()); 
                    }
                    // InternalPaplj.g:783:3: ( rule__UnaryExpr__Group_1__0 )
                    // InternalPaplj.g:783:4: rule__UnaryExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExprAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPaplj.g:787:2: ( ( rule__UnaryExpr__Group_2__0 ) )
                    {
                    // InternalPaplj.g:787:2: ( ( rule__UnaryExpr__Group_2__0 ) )
                    // InternalPaplj.g:788:3: ( rule__UnaryExpr__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExprAccess().getGroup_2()); 
                    }
                    // InternalPaplj.g:789:3: ( rule__UnaryExpr__Group_2__0 )
                    // InternalPaplj.g:789:4: rule__UnaryExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpr__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExprAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Alternatives"


    // $ANTLR start "rule__PrimaryExpr__Alternatives"
    // InternalPaplj.g:797:1: rule__PrimaryExpr__Alternatives : ( ( ( rule__PrimaryExpr__Group_0__0 ) ) | ( ( rule__PrimaryExpr__Group_1__0 ) ) | ( ( rule__PrimaryExpr__Group_2__0 ) ) | ( ( rule__PrimaryExpr__Group_3__0 ) ) | ( ( rule__PrimaryExpr__Group_4__0 ) ) | ( ( rule__PrimaryExpr__Group_5__0 ) ) | ( ruleBlock2 ) | ( ( rule__PrimaryExpr__Group_7__0 ) ) );
    public final void rule__PrimaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:801:1: ( ( ( rule__PrimaryExpr__Group_0__0 ) ) | ( ( rule__PrimaryExpr__Group_1__0 ) ) | ( ( rule__PrimaryExpr__Group_2__0 ) ) | ( ( rule__PrimaryExpr__Group_3__0 ) ) | ( ( rule__PrimaryExpr__Group_4__0 ) ) | ( ( rule__PrimaryExpr__Group_5__0 ) ) | ( ruleBlock2 ) | ( ( rule__PrimaryExpr__Group_7__0 ) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case 11:
            case 44:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 38:
                {
                alt7=4;
                }
                break;
            case 39:
                {
                alt7=5;
                }
                break;
            case RULE_ID:
                {
                alt7=6;
                }
                break;
            case 19:
                {
                alt7=7;
                }
                break;
            case 22:
                {
                alt7=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPaplj.g:802:2: ( ( rule__PrimaryExpr__Group_0__0 ) )
                    {
                    // InternalPaplj.g:802:2: ( ( rule__PrimaryExpr__Group_0__0 ) )
                    // InternalPaplj.g:803:3: ( rule__PrimaryExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_0()); 
                    }
                    // InternalPaplj.g:804:3: ( rule__PrimaryExpr__Group_0__0 )
                    // InternalPaplj.g:804:4: rule__PrimaryExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPaplj.g:808:2: ( ( rule__PrimaryExpr__Group_1__0 ) )
                    {
                    // InternalPaplj.g:808:2: ( ( rule__PrimaryExpr__Group_1__0 ) )
                    // InternalPaplj.g:809:3: ( rule__PrimaryExpr__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_1()); 
                    }
                    // InternalPaplj.g:810:3: ( rule__PrimaryExpr__Group_1__0 )
                    // InternalPaplj.g:810:4: rule__PrimaryExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPaplj.g:814:2: ( ( rule__PrimaryExpr__Group_2__0 ) )
                    {
                    // InternalPaplj.g:814:2: ( ( rule__PrimaryExpr__Group_2__0 ) )
                    // InternalPaplj.g:815:3: ( rule__PrimaryExpr__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_2()); 
                    }
                    // InternalPaplj.g:816:3: ( rule__PrimaryExpr__Group_2__0 )
                    // InternalPaplj.g:816:4: rule__PrimaryExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPaplj.g:820:2: ( ( rule__PrimaryExpr__Group_3__0 ) )
                    {
                    // InternalPaplj.g:820:2: ( ( rule__PrimaryExpr__Group_3__0 ) )
                    // InternalPaplj.g:821:3: ( rule__PrimaryExpr__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_3()); 
                    }
                    // InternalPaplj.g:822:3: ( rule__PrimaryExpr__Group_3__0 )
                    // InternalPaplj.g:822:4: rule__PrimaryExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPaplj.g:826:2: ( ( rule__PrimaryExpr__Group_4__0 ) )
                    {
                    // InternalPaplj.g:826:2: ( ( rule__PrimaryExpr__Group_4__0 ) )
                    // InternalPaplj.g:827:3: ( rule__PrimaryExpr__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_4()); 
                    }
                    // InternalPaplj.g:828:3: ( rule__PrimaryExpr__Group_4__0 )
                    // InternalPaplj.g:828:4: rule__PrimaryExpr__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPaplj.g:832:2: ( ( rule__PrimaryExpr__Group_5__0 ) )
                    {
                    // InternalPaplj.g:832:2: ( ( rule__PrimaryExpr__Group_5__0 ) )
                    // InternalPaplj.g:833:3: ( rule__PrimaryExpr__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_5()); 
                    }
                    // InternalPaplj.g:834:3: ( rule__PrimaryExpr__Group_5__0 )
                    // InternalPaplj.g:834:4: rule__PrimaryExpr__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalPaplj.g:838:2: ( ruleBlock2 )
                    {
                    // InternalPaplj.g:838:2: ( ruleBlock2 )
                    // InternalPaplj.g:839:3: ruleBlock2
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getBlock2ParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBlock2();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getBlock2ParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPaplj.g:844:2: ( ( rule__PrimaryExpr__Group_7__0 ) )
                    {
                    // InternalPaplj.g:844:2: ( ( rule__PrimaryExpr__Group_7__0 ) )
                    // InternalPaplj.g:845:3: ( rule__PrimaryExpr__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_7()); 
                    }
                    // InternalPaplj.g:846:3: ( rule__PrimaryExpr__Group_7__0 )
                    // InternalPaplj.g:846:4: rule__PrimaryExpr__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Alternatives"


    // $ANTLR start "rule__PrimaryExpr__Alternatives_1_1"
    // InternalPaplj.g:854:1: rule__PrimaryExpr__Alternatives_1_1 : ( ( ( rule__PrimaryExpr__TrueAssignment_1_1_0 ) ) | ( 'false' ) );
    public final void rule__PrimaryExpr__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:858:1: ( ( ( rule__PrimaryExpr__TrueAssignment_1_1_0 ) ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==44) ) {
                alt8=1;
            }
            else if ( (LA8_0==11) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPaplj.g:859:2: ( ( rule__PrimaryExpr__TrueAssignment_1_1_0 ) )
                    {
                    // InternalPaplj.g:859:2: ( ( rule__PrimaryExpr__TrueAssignment_1_1_0 ) )
                    // InternalPaplj.g:860:3: ( rule__PrimaryExpr__TrueAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getTrueAssignment_1_1_0()); 
                    }
                    // InternalPaplj.g:861:3: ( rule__PrimaryExpr__TrueAssignment_1_1_0 )
                    // InternalPaplj.g:861:4: rule__PrimaryExpr__TrueAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__TrueAssignment_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getTrueAssignment_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPaplj.g:865:2: ( 'false' )
                    {
                    // InternalPaplj.g:865:2: ( 'false' )
                    // InternalPaplj.g:866:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getFalseKeyword_1_1_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getFalseKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Alternatives_1_1"


    // $ANTLR start "rule__Program__Group__0"
    // InternalPaplj.g:875:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:879:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPaplj.g:880:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalPaplj.g:887:1: rule__Program__Group__0__Impl : ( ( rule__Program__Group_0__0 )? ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:891:1: ( ( ( rule__Program__Group_0__0 )? ) )
            // InternalPaplj.g:892:1: ( ( rule__Program__Group_0__0 )? )
            {
            // InternalPaplj.g:892:1: ( ( rule__Program__Group_0__0 )? )
            // InternalPaplj.g:893:2: ( rule__Program__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_0()); 
            }
            // InternalPaplj.g:894:2: ( rule__Program__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPaplj.g:894:3: rule__Program__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalPaplj.g:902:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:906:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPaplj.g:907:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalPaplj.g:914:1: rule__Program__Group__1__Impl : ( ( rule__Program__ImportsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:918:1: ( ( ( rule__Program__ImportsAssignment_1 )* ) )
            // InternalPaplj.g:919:1: ( ( rule__Program__ImportsAssignment_1 )* )
            {
            // InternalPaplj.g:919:1: ( ( rule__Program__ImportsAssignment_1 )* )
            // InternalPaplj.g:920:2: ( rule__Program__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getImportsAssignment_1()); 
            }
            // InternalPaplj.g:921:2: ( rule__Program__ImportsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPaplj.g:921:3: rule__Program__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getImportsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalPaplj.g:929:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:933:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalPaplj.g:934:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalPaplj.g:941:1: rule__Program__Group__2__Impl : ( ( rule__Program__ClassesAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:945:1: ( ( ( rule__Program__ClassesAssignment_2 )* ) )
            // InternalPaplj.g:946:1: ( ( rule__Program__ClassesAssignment_2 )* )
            {
            // InternalPaplj.g:946:1: ( ( rule__Program__ClassesAssignment_2 )* )
            // InternalPaplj.g:947:2: ( rule__Program__ClassesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesAssignment_2()); 
            }
            // InternalPaplj.g:948:2: ( rule__Program__ClassesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPaplj.g:948:3: rule__Program__ClassesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__ClassesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalPaplj.g:956:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:960:1: ( rule__Program__Group__3__Impl )
            // InternalPaplj.g:961:2: rule__Program__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalPaplj.g:967:1: rule__Program__Group__3__Impl : ( ( rule__Program__Group_3__0 )? ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:971:1: ( ( ( rule__Program__Group_3__0 )? ) )
            // InternalPaplj.g:972:1: ( ( rule__Program__Group_3__0 )? )
            {
            // InternalPaplj.g:972:1: ( ( rule__Program__Group_3__0 )? )
            // InternalPaplj.g:973:2: ( rule__Program__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_3()); 
            }
            // InternalPaplj.g:974:2: ( rule__Program__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPaplj.g:974:3: rule__Program__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group_0__0"
    // InternalPaplj.g:983:1: rule__Program__Group_0__0 : rule__Program__Group_0__0__Impl rule__Program__Group_0__1 ;
    public final void rule__Program__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:987:1: ( rule__Program__Group_0__0__Impl rule__Program__Group_0__1 )
            // InternalPaplj.g:988:2: rule__Program__Group_0__0__Impl rule__Program__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__0"


    // $ANTLR start "rule__Program__Group_0__0__Impl"
    // InternalPaplj.g:995:1: rule__Program__Group_0__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:999:1: ( ( 'program' ) )
            // InternalPaplj.g:1000:1: ( 'program' )
            {
            // InternalPaplj.g:1000:1: ( 'program' )
            // InternalPaplj.g:1001:2: 'program'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramKeyword_0_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getProgramKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__0__Impl"


    // $ANTLR start "rule__Program__Group_0__1"
    // InternalPaplj.g:1010:1: rule__Program__Group_0__1 : rule__Program__Group_0__1__Impl rule__Program__Group_0__2 ;
    public final void rule__Program__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1014:1: ( rule__Program__Group_0__1__Impl rule__Program__Group_0__2 )
            // InternalPaplj.g:1015:2: rule__Program__Group_0__1__Impl rule__Program__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__1"


    // $ANTLR start "rule__Program__Group_0__1__Impl"
    // InternalPaplj.g:1022:1: rule__Program__Group_0__1__Impl : ( ( rule__Program__NameAssignment_0_1 ) ) ;
    public final void rule__Program__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1026:1: ( ( ( rule__Program__NameAssignment_0_1 ) ) )
            // InternalPaplj.g:1027:1: ( ( rule__Program__NameAssignment_0_1 ) )
            {
            // InternalPaplj.g:1027:1: ( ( rule__Program__NameAssignment_0_1 ) )
            // InternalPaplj.g:1028:2: ( rule__Program__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_0_1()); 
            }
            // InternalPaplj.g:1029:2: ( rule__Program__NameAssignment_0_1 )
            // InternalPaplj.g:1029:3: rule__Program__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__1__Impl"


    // $ANTLR start "rule__Program__Group_0__2"
    // InternalPaplj.g:1037:1: rule__Program__Group_0__2 : rule__Program__Group_0__2__Impl ;
    public final void rule__Program__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1041:1: ( rule__Program__Group_0__2__Impl )
            // InternalPaplj.g:1042:2: rule__Program__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__2"


    // $ANTLR start "rule__Program__Group_0__2__Impl"
    // InternalPaplj.g:1048:1: rule__Program__Group_0__2__Impl : ( ( ';' )? ) ;
    public final void rule__Program__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1052:1: ( ( ( ';' )? ) )
            // InternalPaplj.g:1053:1: ( ( ';' )? )
            {
            // InternalPaplj.g:1053:1: ( ( ';' )? )
            // InternalPaplj.g:1054:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_0_2()); 
            }
            // InternalPaplj.g:1055:2: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPaplj.g:1055:3: ';'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getSemicolonKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__2__Impl"


    // $ANTLR start "rule__Program__Group_3__0"
    // InternalPaplj.g:1064:1: rule__Program__Group_3__0 : rule__Program__Group_3__0__Impl rule__Program__Group_3__1 ;
    public final void rule__Program__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1068:1: ( rule__Program__Group_3__0__Impl rule__Program__Group_3__1 )
            // InternalPaplj.g:1069:2: rule__Program__Group_3__0__Impl rule__Program__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__0"


    // $ANTLR start "rule__Program__Group_3__0__Impl"
    // InternalPaplj.g:1076:1: rule__Program__Group_3__0__Impl : ( 'run' ) ;
    public final void rule__Program__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1080:1: ( ( 'run' ) )
            // InternalPaplj.g:1081:1: ( 'run' )
            {
            // InternalPaplj.g:1081:1: ( 'run' )
            // InternalPaplj.g:1082:2: 'run'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getRunKeyword_3_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getRunKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__0__Impl"


    // $ANTLR start "rule__Program__Group_3__1"
    // InternalPaplj.g:1091:1: rule__Program__Group_3__1 : rule__Program__Group_3__1__Impl ;
    public final void rule__Program__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1095:1: ( rule__Program__Group_3__1__Impl )
            // InternalPaplj.g:1096:2: rule__Program__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__1"


    // $ANTLR start "rule__Program__Group_3__1__Impl"
    // InternalPaplj.g:1102:1: rule__Program__Group_3__1__Impl : ( ( rule__Program__ExprAssignment_3_1 ) ) ;
    public final void rule__Program__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1106:1: ( ( ( rule__Program__ExprAssignment_3_1 ) ) )
            // InternalPaplj.g:1107:1: ( ( rule__Program__ExprAssignment_3_1 ) )
            {
            // InternalPaplj.g:1107:1: ( ( rule__Program__ExprAssignment_3_1 ) )
            // InternalPaplj.g:1108:2: ( rule__Program__ExprAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExprAssignment_3_1()); 
            }
            // InternalPaplj.g:1109:2: ( rule__Program__ExprAssignment_3_1 )
            // InternalPaplj.g:1109:3: rule__Program__ExprAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__ExprAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getExprAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalPaplj.g:1118:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1122:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalPaplj.g:1123:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalPaplj.g:1130:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1134:1: ( ( RULE_ID ) )
            // InternalPaplj.g:1135:1: ( RULE_ID )
            {
            // InternalPaplj.g:1135:1: ( RULE_ID )
            // InternalPaplj.g:1136:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalPaplj.g:1145:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1149:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalPaplj.g:1150:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalPaplj.g:1156:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1160:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalPaplj.g:1161:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalPaplj.g:1161:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalPaplj.g:1162:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalPaplj.g:1163:2: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPaplj.g:1163:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalPaplj.g:1172:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1176:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalPaplj.g:1177:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalPaplj.g:1184:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1188:1: ( ( '.' ) )
            // InternalPaplj.g:1189:1: ( '.' )
            {
            // InternalPaplj.g:1189:1: ( '.' )
            // InternalPaplj.g:1190:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalPaplj.g:1199:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1203:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalPaplj.g:1204:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalPaplj.g:1210:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1214:1: ( ( RULE_ID ) )
            // InternalPaplj.g:1215:1: ( RULE_ID )
            {
            // InternalPaplj.g:1215:1: ( RULE_ID )
            // InternalPaplj.g:1216:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalPaplj.g:1226:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1230:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalPaplj.g:1231:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalPaplj.g:1238:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1242:1: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:1243:1: ( ruleQualifiedName )
            {
            // InternalPaplj.g:1243:1: ( ruleQualifiedName )
            // InternalPaplj.g:1244:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalPaplj.g:1253:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1257:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalPaplj.g:1258:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalPaplj.g:1264:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1268:1: ( ( ( '.*' )? ) )
            // InternalPaplj.g:1269:1: ( ( '.*' )? )
            {
            // InternalPaplj.g:1269:1: ( ( '.*' )? )
            // InternalPaplj.g:1270:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalPaplj.g:1271:2: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPaplj.g:1271:3: '.*'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalPaplj.g:1280:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1284:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalPaplj.g:1285:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalPaplj.g:1292:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1296:1: ( ( 'import' ) )
            // InternalPaplj.g:1297:1: ( 'import' )
            {
            // InternalPaplj.g:1297:1: ( 'import' )
            // InternalPaplj.g:1298:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalPaplj.g:1307:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1311:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalPaplj.g:1312:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalPaplj.g:1319:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1323:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalPaplj.g:1324:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalPaplj.g:1324:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalPaplj.g:1325:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalPaplj.g:1326:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalPaplj.g:1326:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalPaplj.g:1334:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1338:1: ( rule__Import__Group__2__Impl )
            // InternalPaplj.g:1339:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalPaplj.g:1345:1: rule__Import__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1349:1: ( ( ( ';' )? ) )
            // InternalPaplj.g:1350:1: ( ( ';' )? )
            {
            // InternalPaplj.g:1350:1: ( ( ';' )? )
            // InternalPaplj.g:1351:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            }
            // InternalPaplj.g:1352:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPaplj.g:1352:3: ';'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalPaplj.g:1361:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1365:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalPaplj.g:1366:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalPaplj.g:1373:1: rule__Type__Group__0__Impl : ( 'class' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1377:1: ( ( 'class' ) )
            // InternalPaplj.g:1378:1: ( 'class' )
            {
            // InternalPaplj.g:1378:1: ( 'class' )
            // InternalPaplj.g:1379:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getClassKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getClassKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalPaplj.g:1388:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1392:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalPaplj.g:1393:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalPaplj.g:1400:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1404:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalPaplj.g:1405:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalPaplj.g:1405:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalPaplj.g:1406:2: ( rule__Type__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            }
            // InternalPaplj.g:1407:2: ( rule__Type__NameAssignment_1 )
            // InternalPaplj.g:1407:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalPaplj.g:1415:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1419:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalPaplj.g:1420:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Type__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalPaplj.g:1427:1: rule__Type__Group__2__Impl : ( ( rule__Type__Group_2__0 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1431:1: ( ( ( rule__Type__Group_2__0 )? ) )
            // InternalPaplj.g:1432:1: ( ( rule__Type__Group_2__0 )? )
            {
            // InternalPaplj.g:1432:1: ( ( rule__Type__Group_2__0 )? )
            // InternalPaplj.g:1433:2: ( rule__Type__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGroup_2()); 
            }
            // InternalPaplj.g:1434:2: ( rule__Type__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPaplj.g:1434:3: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalPaplj.g:1442:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1446:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalPaplj.g:1447:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalPaplj.g:1454:1: rule__Type__Group__3__Impl : ( '{' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1458:1: ( ( '{' ) )
            // InternalPaplj.g:1459:1: ( '{' )
            {
            // InternalPaplj.g:1459:1: ( '{' )
            // InternalPaplj.g:1460:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Type__Group__4"
    // InternalPaplj.g:1469:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1473:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalPaplj.g:1474:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4"


    // $ANTLR start "rule__Type__Group__4__Impl"
    // InternalPaplj.g:1481:1: rule__Type__Group__4__Impl : ( ( rule__Type__MembersAssignment_4 )* ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1485:1: ( ( ( rule__Type__MembersAssignment_4 )* ) )
            // InternalPaplj.g:1486:1: ( ( rule__Type__MembersAssignment_4 )* )
            {
            // InternalPaplj.g:1486:1: ( ( rule__Type__MembersAssignment_4 )* )
            // InternalPaplj.g:1487:2: ( rule__Type__MembersAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getMembersAssignment_4()); 
            }
            // InternalPaplj.g:1488:2: ( rule__Type__MembersAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPaplj.g:1488:3: rule__Type__MembersAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Type__MembersAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getMembersAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__5"
    // InternalPaplj.g:1496:1: rule__Type__Group__5 : rule__Type__Group__5__Impl ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1500:1: ( rule__Type__Group__5__Impl )
            // InternalPaplj.g:1501:2: rule__Type__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5"


    // $ANTLR start "rule__Type__Group__5__Impl"
    // InternalPaplj.g:1507:1: rule__Type__Group__5__Impl : ( '}' ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1511:1: ( ( '}' ) )
            // InternalPaplj.g:1512:1: ( '}' )
            {
            // InternalPaplj.g:1512:1: ( '}' )
            // InternalPaplj.g:1513:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalPaplj.g:1523:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1527:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalPaplj.g:1528:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Type__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalPaplj.g:1535:1: rule__Type__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1539:1: ( ( 'extends' ) )
            // InternalPaplj.g:1540:1: ( 'extends' )
            {
            // InternalPaplj.g:1540:1: ( 'extends' )
            // InternalPaplj.g:1541:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getExtendsKeyword_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalPaplj.g:1550:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1554:1: ( rule__Type__Group_2__1__Impl )
            // InternalPaplj.g:1555:2: rule__Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalPaplj.g:1561:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1565:1: ( ( ( rule__Type__SuperTypeAssignment_2_1 ) ) )
            // InternalPaplj.g:1566:1: ( ( rule__Type__SuperTypeAssignment_2_1 ) )
            {
            // InternalPaplj.g:1566:1: ( ( rule__Type__SuperTypeAssignment_2_1 ) )
            // InternalPaplj.g:1567:2: ( rule__Type__SuperTypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSuperTypeAssignment_2_1()); 
            }
            // InternalPaplj.g:1568:2: ( rule__Type__SuperTypeAssignment_2_1 )
            // InternalPaplj.g:1568:3: rule__Type__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__SuperTypeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSuperTypeAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalPaplj.g:1577:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1581:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalPaplj.g:1582:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalPaplj.g:1589:1: rule__Field__Group__0__Impl : ( ( rule__Field__TypeAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1593:1: ( ( ( rule__Field__TypeAssignment_0 ) ) )
            // InternalPaplj.g:1594:1: ( ( rule__Field__TypeAssignment_0 ) )
            {
            // InternalPaplj.g:1594:1: ( ( rule__Field__TypeAssignment_0 ) )
            // InternalPaplj.g:1595:2: ( rule__Field__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
            }
            // InternalPaplj.g:1596:2: ( rule__Field__TypeAssignment_0 )
            // InternalPaplj.g:1596:3: rule__Field__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalPaplj.g:1604:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1608:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalPaplj.g:1609:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalPaplj.g:1616:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1620:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalPaplj.g:1621:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalPaplj.g:1621:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalPaplj.g:1622:2: ( rule__Field__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            }
            // InternalPaplj.g:1623:2: ( rule__Field__NameAssignment_1 )
            // InternalPaplj.g:1623:3: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalPaplj.g:1631:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1635:1: ( rule__Field__Group__2__Impl )
            // InternalPaplj.g:1636:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalPaplj.g:1642:1: rule__Field__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1646:1: ( ( ( ';' )? ) )
            // InternalPaplj.g:1647:1: ( ( ';' )? )
            {
            // InternalPaplj.g:1647:1: ( ( ';' )? )
            // InternalPaplj.g:1648:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_2()); 
            }
            // InternalPaplj.g:1649:2: ( ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPaplj.g:1649:3: ';'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalPaplj.g:1658:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1662:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalPaplj.g:1663:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalPaplj.g:1670:1: rule__Method__Group__0__Impl : ( ( rule__Method__TypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1674:1: ( ( ( rule__Method__TypeAssignment_0 ) ) )
            // InternalPaplj.g:1675:1: ( ( rule__Method__TypeAssignment_0 ) )
            {
            // InternalPaplj.g:1675:1: ( ( rule__Method__TypeAssignment_0 ) )
            // InternalPaplj.g:1676:2: ( rule__Method__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getTypeAssignment_0()); 
            }
            // InternalPaplj.g:1677:2: ( rule__Method__TypeAssignment_0 )
            // InternalPaplj.g:1677:3: rule__Method__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalPaplj.g:1685:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1689:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalPaplj.g:1690:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalPaplj.g:1697:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1701:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalPaplj.g:1702:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalPaplj.g:1702:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalPaplj.g:1703:2: ( rule__Method__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            }
            // InternalPaplj.g:1704:2: ( rule__Method__NameAssignment_1 )
            // InternalPaplj.g:1704:3: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalPaplj.g:1712:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1716:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalPaplj.g:1717:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalPaplj.g:1724:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1728:1: ( ( '(' ) )
            // InternalPaplj.g:1729:1: ( '(' )
            {
            // InternalPaplj.g:1729:1: ( '(' )
            // InternalPaplj.g:1730:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalPaplj.g:1739:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1743:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalPaplj.g:1744:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalPaplj.g:1751:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1755:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalPaplj.g:1756:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalPaplj.g:1756:1: ( ( rule__Method__Group_3__0 )? )
            // InternalPaplj.g:1757:2: ( rule__Method__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_3()); 
            }
            // InternalPaplj.g:1758:2: ( rule__Method__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPaplj.g:1758:3: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalPaplj.g:1766:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1770:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalPaplj.g:1771:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Method__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalPaplj.g:1778:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1782:1: ( ( ')' ) )
            // InternalPaplj.g:1783:1: ( ')' )
            {
            // InternalPaplj.g:1783:1: ( ')' )
            // InternalPaplj.g:1784:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalPaplj.g:1793:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1797:1: ( rule__Method__Group__5__Impl )
            // InternalPaplj.g:1798:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalPaplj.g:1804:1: rule__Method__Group__5__Impl : ( ( rule__Method__BodyAssignment_5 ) ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1808:1: ( ( ( rule__Method__BodyAssignment_5 ) ) )
            // InternalPaplj.g:1809:1: ( ( rule__Method__BodyAssignment_5 ) )
            {
            // InternalPaplj.g:1809:1: ( ( rule__Method__BodyAssignment_5 ) )
            // InternalPaplj.g:1810:2: ( rule__Method__BodyAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getBodyAssignment_5()); 
            }
            // InternalPaplj.g:1811:2: ( rule__Method__BodyAssignment_5 )
            // InternalPaplj.g:1811:3: rule__Method__BodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Method__BodyAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getBodyAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // InternalPaplj.g:1820:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1824:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalPaplj.g:1825:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Method__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // InternalPaplj.g:1832:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ParamsAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1836:1: ( ( ( rule__Method__ParamsAssignment_3_0 ) ) )
            // InternalPaplj.g:1837:1: ( ( rule__Method__ParamsAssignment_3_0 ) )
            {
            // InternalPaplj.g:1837:1: ( ( rule__Method__ParamsAssignment_3_0 ) )
            // InternalPaplj.g:1838:2: ( rule__Method__ParamsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_3_0()); 
            }
            // InternalPaplj.g:1839:2: ( rule__Method__ParamsAssignment_3_0 )
            // InternalPaplj.g:1839:3: rule__Method__ParamsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParamsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // InternalPaplj.g:1847:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1851:1: ( rule__Method__Group_3__1__Impl )
            // InternalPaplj.g:1852:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // InternalPaplj.g:1858:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1862:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalPaplj.g:1863:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalPaplj.g:1863:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalPaplj.g:1864:2: ( rule__Method__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            }
            // InternalPaplj.g:1865:2: ( rule__Method__Group_3_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPaplj.g:1865:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group_3_1__0"
    // InternalPaplj.g:1874:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1878:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalPaplj.g:1879:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Method__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__0"


    // $ANTLR start "rule__Method__Group_3_1__0__Impl"
    // InternalPaplj.g:1886:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1890:1: ( ( ',' ) )
            // InternalPaplj.g:1891:1: ( ',' )
            {
            // InternalPaplj.g:1891:1: ( ',' )
            // InternalPaplj.g:1892:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__0__Impl"


    // $ANTLR start "rule__Method__Group_3_1__1"
    // InternalPaplj.g:1901:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1905:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalPaplj.g:1906:2: rule__Method__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__1"


    // $ANTLR start "rule__Method__Group_3_1__1__Impl"
    // InternalPaplj.g:1912:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ParamsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1916:1: ( ( ( rule__Method__ParamsAssignment_3_1_1 ) ) )
            // InternalPaplj.g:1917:1: ( ( rule__Method__ParamsAssignment_3_1_1 ) )
            {
            // InternalPaplj.g:1917:1: ( ( rule__Method__ParamsAssignment_3_1_1 ) )
            // InternalPaplj.g:1918:2: ( rule__Method__ParamsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_3_1_1()); 
            }
            // InternalPaplj.g:1919:2: ( rule__Method__ParamsAssignment_3_1_1 )
            // InternalPaplj.g:1919:3: rule__Method__ParamsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParamsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__1__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalPaplj.g:1928:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1932:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalPaplj.g:1933:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Param__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalPaplj.g:1940:1: rule__Param__Group__0__Impl : ( ( rule__Param__TypeAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1944:1: ( ( ( rule__Param__TypeAssignment_0 ) ) )
            // InternalPaplj.g:1945:1: ( ( rule__Param__TypeAssignment_0 ) )
            {
            // InternalPaplj.g:1945:1: ( ( rule__Param__TypeAssignment_0 ) )
            // InternalPaplj.g:1946:2: ( rule__Param__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeAssignment_0()); 
            }
            // InternalPaplj.g:1947:2: ( rule__Param__TypeAssignment_0 )
            // InternalPaplj.g:1947:3: rule__Param__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalPaplj.g:1955:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1959:1: ( rule__Param__Group__1__Impl )
            // InternalPaplj.g:1960:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalPaplj.g:1966:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1970:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // InternalPaplj.g:1971:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // InternalPaplj.g:1971:1: ( ( rule__Param__NameAssignment_1 ) )
            // InternalPaplj.g:1972:2: ( rule__Param__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            }
            // InternalPaplj.g:1973:2: ( rule__Param__NameAssignment_1 )
            // InternalPaplj.g:1973:3: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Param__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalPaplj.g:1982:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1986:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalPaplj.g:1987:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Binding__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalPaplj.g:1994:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__TypeAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:1998:1: ( ( ( rule__Binding__TypeAssignment_0 ) ) )
            // InternalPaplj.g:1999:1: ( ( rule__Binding__TypeAssignment_0 ) )
            {
            // InternalPaplj.g:1999:1: ( ( rule__Binding__TypeAssignment_0 ) )
            // InternalPaplj.g:2000:2: ( rule__Binding__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getTypeAssignment_0()); 
            }
            // InternalPaplj.g:2001:2: ( rule__Binding__TypeAssignment_0 )
            // InternalPaplj.g:2001:3: rule__Binding__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalPaplj.g:2009:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2013:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalPaplj.g:2014:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Binding__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalPaplj.g:2021:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__NameAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2025:1: ( ( ( rule__Binding__NameAssignment_1 ) ) )
            // InternalPaplj.g:2026:1: ( ( rule__Binding__NameAssignment_1 ) )
            {
            // InternalPaplj.g:2026:1: ( ( rule__Binding__NameAssignment_1 ) )
            // InternalPaplj.g:2027:2: ( rule__Binding__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getNameAssignment_1()); 
            }
            // InternalPaplj.g:2028:2: ( rule__Binding__NameAssignment_1 )
            // InternalPaplj.g:2028:3: rule__Binding__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binding__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalPaplj.g:2036:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2040:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalPaplj.g:2041:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Binding__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalPaplj.g:2048:1: rule__Binding__Group__2__Impl : ( '=' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2052:1: ( ( '=' ) )
            // InternalPaplj.g:2053:1: ( '=' )
            {
            // InternalPaplj.g:2053:1: ( '=' )
            // InternalPaplj.g:2054:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getEqualsSignKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // InternalPaplj.g:2063:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2067:1: ( rule__Binding__Group__3__Impl )
            // InternalPaplj.g:2068:2: rule__Binding__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalPaplj.g:2074:1: rule__Binding__Group__3__Impl : ( ( rule__Binding__ValueAssignment_3 ) ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2078:1: ( ( ( rule__Binding__ValueAssignment_3 ) ) )
            // InternalPaplj.g:2079:1: ( ( rule__Binding__ValueAssignment_3 ) )
            {
            // InternalPaplj.g:2079:1: ( ( rule__Binding__ValueAssignment_3 ) )
            // InternalPaplj.g:2080:2: ( rule__Binding__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getValueAssignment_3()); 
            }
            // InternalPaplj.g:2081:2: ( rule__Binding__ValueAssignment_3 )
            // InternalPaplj.g:2081:3: rule__Binding__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Block2__Group__0"
    // InternalPaplj.g:2090:1: rule__Block2__Group__0 : rule__Block2__Group__0__Impl rule__Block2__Group__1 ;
    public final void rule__Block2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2094:1: ( rule__Block2__Group__0__Impl rule__Block2__Group__1 )
            // InternalPaplj.g:2095:2: rule__Block2__Group__0__Impl rule__Block2__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Block2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block2__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group__0"


    // $ANTLR start "rule__Block2__Group__0__Impl"
    // InternalPaplj.g:2102:1: rule__Block2__Group__0__Impl : ( () ) ;
    public final void rule__Block2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2106:1: ( ( () ) )
            // InternalPaplj.g:2107:1: ( () )
            {
            // InternalPaplj.g:2107:1: ( () )
            // InternalPaplj.g:2108:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getBlock2Action_0()); 
            }
            // InternalPaplj.g:2109:2: ()
            // InternalPaplj.g:2109:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getBlock2Action_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group__0__Impl"


    // $ANTLR start "rule__Block2__Group__1"
    // InternalPaplj.g:2117:1: rule__Block2__Group__1 : rule__Block2__Group__1__Impl rule__Block2__Group__2 ;
    public final void rule__Block2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2121:1: ( rule__Block2__Group__1__Impl rule__Block2__Group__2 )
            // InternalPaplj.g:2122:2: rule__Block2__Group__1__Impl rule__Block2__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Block2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block2__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group__1"


    // $ANTLR start "rule__Block2__Group__1__Impl"
    // InternalPaplj.g:2129:1: rule__Block2__Group__1__Impl : ( '{' ) ;
    public final void rule__Block2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2133:1: ( ( '{' ) )
            // InternalPaplj.g:2134:1: ( '{' )
            {
            // InternalPaplj.g:2134:1: ( '{' )
            // InternalPaplj.g:2135:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group__1__Impl"


    // $ANTLR start "rule__Block2__Group__2"
    // InternalPaplj.g:2144:1: rule__Block2__Group__2 : rule__Block2__Group__2__Impl rule__Block2__Group__3 ;
    public final void rule__Block2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2148:1: ( rule__Block2__Group__2__Impl rule__Block2__Group__3 )
            // InternalPaplj.g:2149:2: rule__Block2__Group__2__Impl rule__Block2__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Block2__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block2__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group__2"


    // $ANTLR start "rule__Block2__Group__2__Impl"
    // InternalPaplj.g:2156:1: rule__Block2__Group__2__Impl : ( ( rule__Block2__Group_2__0 )? ) ;
    public final void rule__Block2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2160:1: ( ( ( rule__Block2__Group_2__0 )? ) )
            // InternalPaplj.g:2161:1: ( ( rule__Block2__Group_2__0 )? )
            {
            // InternalPaplj.g:2161:1: ( ( rule__Block2__Group_2__0 )? )
            // InternalPaplj.g:2162:2: ( rule__Block2__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getGroup_2()); 
            }
            // InternalPaplj.g:2163:2: ( rule__Block2__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==11||LA22_0==19||LA22_0==22||LA22_0==32||(LA22_0>=36 && LA22_0<=40)||LA22_0==42||LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPaplj.g:2163:3: rule__Block2__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block2__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group__2__Impl"


    // $ANTLR start "rule__Block2__Group__3"
    // InternalPaplj.g:2171:1: rule__Block2__Group__3 : rule__Block2__Group__3__Impl rule__Block2__Group__4 ;
    public final void rule__Block2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2175:1: ( rule__Block2__Group__3__Impl rule__Block2__Group__4 )
            // InternalPaplj.g:2176:2: rule__Block2__Group__3__Impl rule__Block2__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Block2__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block2__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group__3"


    // $ANTLR start "rule__Block2__Group__3__Impl"
    // InternalPaplj.g:2183:1: rule__Block2__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Block2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2187:1: ( ( ( ';' )? ) )
            // InternalPaplj.g:2188:1: ( ( ';' )? )
            {
            // InternalPaplj.g:2188:1: ( ( ';' )? )
            // InternalPaplj.g:2189:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getSemicolonKeyword_3()); 
            }
            // InternalPaplj.g:2190:2: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPaplj.g:2190:3: ';'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group__3__Impl"


    // $ANTLR start "rule__Block2__Group__4"
    // InternalPaplj.g:2198:1: rule__Block2__Group__4 : rule__Block2__Group__4__Impl ;
    public final void rule__Block2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2202:1: ( rule__Block2__Group__4__Impl )
            // InternalPaplj.g:2203:2: rule__Block2__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block2__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group__4"


    // $ANTLR start "rule__Block2__Group__4__Impl"
    // InternalPaplj.g:2209:1: rule__Block2__Group__4__Impl : ( '}' ) ;
    public final void rule__Block2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2213:1: ( ( '}' ) )
            // InternalPaplj.g:2214:1: ( '}' )
            {
            // InternalPaplj.g:2214:1: ( '}' )
            // InternalPaplj.g:2215:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getRightCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group__4__Impl"


    // $ANTLR start "rule__Block2__Group_2__0"
    // InternalPaplj.g:2225:1: rule__Block2__Group_2__0 : rule__Block2__Group_2__0__Impl rule__Block2__Group_2__1 ;
    public final void rule__Block2__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2229:1: ( rule__Block2__Group_2__0__Impl rule__Block2__Group_2__1 )
            // InternalPaplj.g:2230:2: rule__Block2__Group_2__0__Impl rule__Block2__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Block2__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block2__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group_2__0"


    // $ANTLR start "rule__Block2__Group_2__0__Impl"
    // InternalPaplj.g:2237:1: rule__Block2__Group_2__0__Impl : ( ( rule__Block2__ExprsAssignment_2_0 ) ) ;
    public final void rule__Block2__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2241:1: ( ( ( rule__Block2__ExprsAssignment_2_0 ) ) )
            // InternalPaplj.g:2242:1: ( ( rule__Block2__ExprsAssignment_2_0 ) )
            {
            // InternalPaplj.g:2242:1: ( ( rule__Block2__ExprsAssignment_2_0 ) )
            // InternalPaplj.g:2243:2: ( rule__Block2__ExprsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getExprsAssignment_2_0()); 
            }
            // InternalPaplj.g:2244:2: ( rule__Block2__ExprsAssignment_2_0 )
            // InternalPaplj.g:2244:3: rule__Block2__ExprsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Block2__ExprsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getExprsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group_2__0__Impl"


    // $ANTLR start "rule__Block2__Group_2__1"
    // InternalPaplj.g:2252:1: rule__Block2__Group_2__1 : rule__Block2__Group_2__1__Impl ;
    public final void rule__Block2__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2256:1: ( rule__Block2__Group_2__1__Impl )
            // InternalPaplj.g:2257:2: rule__Block2__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block2__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group_2__1"


    // $ANTLR start "rule__Block2__Group_2__1__Impl"
    // InternalPaplj.g:2263:1: rule__Block2__Group_2__1__Impl : ( ( rule__Block2__Group_2_1__0 )* ) ;
    public final void rule__Block2__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2267:1: ( ( ( rule__Block2__Group_2_1__0 )* ) )
            // InternalPaplj.g:2268:1: ( ( rule__Block2__Group_2_1__0 )* )
            {
            // InternalPaplj.g:2268:1: ( ( rule__Block2__Group_2_1__0 )* )
            // InternalPaplj.g:2269:2: ( rule__Block2__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getGroup_2_1()); 
            }
            // InternalPaplj.g:2270:2: ( rule__Block2__Group_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==13) ) {
                    int LA24_1 = input.LA(2);

                    if ( ((LA24_1>=RULE_ID && LA24_1<=RULE_INT)||LA24_1==11||LA24_1==19||LA24_1==22||LA24_1==32||(LA24_1>=36 && LA24_1<=40)||LA24_1==42||LA24_1==44) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalPaplj.g:2270:3: rule__Block2__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Block2__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group_2__1__Impl"


    // $ANTLR start "rule__Block2__Group_2_1__0"
    // InternalPaplj.g:2279:1: rule__Block2__Group_2_1__0 : rule__Block2__Group_2_1__0__Impl rule__Block2__Group_2_1__1 ;
    public final void rule__Block2__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2283:1: ( rule__Block2__Group_2_1__0__Impl rule__Block2__Group_2_1__1 )
            // InternalPaplj.g:2284:2: rule__Block2__Group_2_1__0__Impl rule__Block2__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Block2__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block2__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group_2_1__0"


    // $ANTLR start "rule__Block2__Group_2_1__0__Impl"
    // InternalPaplj.g:2291:1: rule__Block2__Group_2_1__0__Impl : ( ';' ) ;
    public final void rule__Block2__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2295:1: ( ( ';' ) )
            // InternalPaplj.g:2296:1: ( ';' )
            {
            // InternalPaplj.g:2296:1: ( ';' )
            // InternalPaplj.g:2297:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getSemicolonKeyword_2_1_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getSemicolonKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group_2_1__0__Impl"


    // $ANTLR start "rule__Block2__Group_2_1__1"
    // InternalPaplj.g:2306:1: rule__Block2__Group_2_1__1 : rule__Block2__Group_2_1__1__Impl ;
    public final void rule__Block2__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2310:1: ( rule__Block2__Group_2_1__1__Impl )
            // InternalPaplj.g:2311:2: rule__Block2__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block2__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group_2_1__1"


    // $ANTLR start "rule__Block2__Group_2_1__1__Impl"
    // InternalPaplj.g:2317:1: rule__Block2__Group_2_1__1__Impl : ( ( rule__Block2__ExprsAssignment_2_1_1 ) ) ;
    public final void rule__Block2__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2321:1: ( ( ( rule__Block2__ExprsAssignment_2_1_1 ) ) )
            // InternalPaplj.g:2322:1: ( ( rule__Block2__ExprsAssignment_2_1_1 ) )
            {
            // InternalPaplj.g:2322:1: ( ( rule__Block2__ExprsAssignment_2_1_1 ) )
            // InternalPaplj.g:2323:2: ( rule__Block2__ExprsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getExprsAssignment_2_1_1()); 
            }
            // InternalPaplj.g:2324:2: ( rule__Block2__ExprsAssignment_2_1_1 )
            // InternalPaplj.g:2324:3: rule__Block2__ExprsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Block2__ExprsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getExprsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__Group_2_1__1__Impl"


    // $ANTLR start "rule__AssignmentExpr__Group__0"
    // InternalPaplj.g:2333:1: rule__AssignmentExpr__Group__0 : rule__AssignmentExpr__Group__0__Impl rule__AssignmentExpr__Group__1 ;
    public final void rule__AssignmentExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2337:1: ( rule__AssignmentExpr__Group__0__Impl rule__AssignmentExpr__Group__1 )
            // InternalPaplj.g:2338:2: rule__AssignmentExpr__Group__0__Impl rule__AssignmentExpr__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__AssignmentExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AssignmentExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group__0"


    // $ANTLR start "rule__AssignmentExpr__Group__0__Impl"
    // InternalPaplj.g:2345:1: rule__AssignmentExpr__Group__0__Impl : ( ruleLogicalOrExpr ) ;
    public final void rule__AssignmentExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2349:1: ( ( ruleLogicalOrExpr ) )
            // InternalPaplj.g:2350:1: ( ruleLogicalOrExpr )
            {
            // InternalPaplj.g:2350:1: ( ruleLogicalOrExpr )
            // InternalPaplj.g:2351:2: ruleLogicalOrExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExprAccess().getLogicalOrExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicalOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExprAccess().getLogicalOrExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group__0__Impl"


    // $ANTLR start "rule__AssignmentExpr__Group__1"
    // InternalPaplj.g:2360:1: rule__AssignmentExpr__Group__1 : rule__AssignmentExpr__Group__1__Impl ;
    public final void rule__AssignmentExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2364:1: ( rule__AssignmentExpr__Group__1__Impl )
            // InternalPaplj.g:2365:2: rule__AssignmentExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group__1"


    // $ANTLR start "rule__AssignmentExpr__Group__1__Impl"
    // InternalPaplj.g:2371:1: rule__AssignmentExpr__Group__1__Impl : ( ( rule__AssignmentExpr__Group_1__0 )? ) ;
    public final void rule__AssignmentExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2375:1: ( ( ( rule__AssignmentExpr__Group_1__0 )? ) )
            // InternalPaplj.g:2376:1: ( ( rule__AssignmentExpr__Group_1__0 )? )
            {
            // InternalPaplj.g:2376:1: ( ( rule__AssignmentExpr__Group_1__0 )? )
            // InternalPaplj.g:2377:2: ( rule__AssignmentExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExprAccess().getGroup_1()); 
            }
            // InternalPaplj.g:2378:2: ( rule__AssignmentExpr__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPaplj.g:2378:3: rule__AssignmentExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssignmentExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group__1__Impl"


    // $ANTLR start "rule__AssignmentExpr__Group_1__0"
    // InternalPaplj.g:2387:1: rule__AssignmentExpr__Group_1__0 : rule__AssignmentExpr__Group_1__0__Impl ;
    public final void rule__AssignmentExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2391:1: ( rule__AssignmentExpr__Group_1__0__Impl )
            // InternalPaplj.g:2392:2: rule__AssignmentExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group_1__0"


    // $ANTLR start "rule__AssignmentExpr__Group_1__0__Impl"
    // InternalPaplj.g:2398:1: rule__AssignmentExpr__Group_1__0__Impl : ( ( rule__AssignmentExpr__Group_1_0__0 ) ) ;
    public final void rule__AssignmentExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2402:1: ( ( ( rule__AssignmentExpr__Group_1_0__0 ) ) )
            // InternalPaplj.g:2403:1: ( ( rule__AssignmentExpr__Group_1_0__0 ) )
            {
            // InternalPaplj.g:2403:1: ( ( rule__AssignmentExpr__Group_1_0__0 ) )
            // InternalPaplj.g:2404:2: ( rule__AssignmentExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExprAccess().getGroup_1_0()); 
            }
            // InternalPaplj.g:2405:2: ( rule__AssignmentExpr__Group_1_0__0 )
            // InternalPaplj.g:2405:3: rule__AssignmentExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group_1__0__Impl"


    // $ANTLR start "rule__AssignmentExpr__Group_1_0__0"
    // InternalPaplj.g:2414:1: rule__AssignmentExpr__Group_1_0__0 : rule__AssignmentExpr__Group_1_0__0__Impl rule__AssignmentExpr__Group_1_0__1 ;
    public final void rule__AssignmentExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2418:1: ( rule__AssignmentExpr__Group_1_0__0__Impl rule__AssignmentExpr__Group_1_0__1 )
            // InternalPaplj.g:2419:2: rule__AssignmentExpr__Group_1_0__0__Impl rule__AssignmentExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
            rule__AssignmentExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AssignmentExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group_1_0__0"


    // $ANTLR start "rule__AssignmentExpr__Group_1_0__0__Impl"
    // InternalPaplj.g:2426:1: rule__AssignmentExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__AssignmentExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2430:1: ( ( () ) )
            // InternalPaplj.g:2431:1: ( () )
            {
            // InternalPaplj.g:2431:1: ( () )
            // InternalPaplj.g:2432:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExprAccess().getAssignmentLeftAction_1_0_0()); 
            }
            // InternalPaplj.g:2433:2: ()
            // InternalPaplj.g:2433:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExprAccess().getAssignmentLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__AssignmentExpr__Group_1_0__1"
    // InternalPaplj.g:2441:1: rule__AssignmentExpr__Group_1_0__1 : rule__AssignmentExpr__Group_1_0__1__Impl rule__AssignmentExpr__Group_1_0__2 ;
    public final void rule__AssignmentExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2445:1: ( rule__AssignmentExpr__Group_1_0__1__Impl rule__AssignmentExpr__Group_1_0__2 )
            // InternalPaplj.g:2446:2: rule__AssignmentExpr__Group_1_0__1__Impl rule__AssignmentExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_8);
            rule__AssignmentExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AssignmentExpr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group_1_0__1"


    // $ANTLR start "rule__AssignmentExpr__Group_1_0__1__Impl"
    // InternalPaplj.g:2453:1: rule__AssignmentExpr__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__AssignmentExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2457:1: ( ( '=' ) )
            // InternalPaplj.g:2458:1: ( '=' )
            {
            // InternalPaplj.g:2458:1: ( '=' )
            // InternalPaplj.g:2459:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExprAccess().getEqualsSignKeyword_1_0_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExprAccess().getEqualsSignKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__AssignmentExpr__Group_1_0__2"
    // InternalPaplj.g:2468:1: rule__AssignmentExpr__Group_1_0__2 : rule__AssignmentExpr__Group_1_0__2__Impl ;
    public final void rule__AssignmentExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2472:1: ( rule__AssignmentExpr__Group_1_0__2__Impl )
            // InternalPaplj.g:2473:2: rule__AssignmentExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group_1_0__2"


    // $ANTLR start "rule__AssignmentExpr__Group_1_0__2__Impl"
    // InternalPaplj.g:2479:1: rule__AssignmentExpr__Group_1_0__2__Impl : ( ( rule__AssignmentExpr__ValueAssignment_1_0_2 ) ) ;
    public final void rule__AssignmentExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2483:1: ( ( ( rule__AssignmentExpr__ValueAssignment_1_0_2 ) ) )
            // InternalPaplj.g:2484:1: ( ( rule__AssignmentExpr__ValueAssignment_1_0_2 ) )
            {
            // InternalPaplj.g:2484:1: ( ( rule__AssignmentExpr__ValueAssignment_1_0_2 ) )
            // InternalPaplj.g:2485:2: ( rule__AssignmentExpr__ValueAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExprAccess().getValueAssignment_1_0_2()); 
            }
            // InternalPaplj.g:2486:2: ( rule__AssignmentExpr__ValueAssignment_1_0_2 )
            // InternalPaplj.g:2486:3: rule__AssignmentExpr__ValueAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentExpr__ValueAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExprAccess().getValueAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__LogicalOrExpr__Group__0"
    // InternalPaplj.g:2495:1: rule__LogicalOrExpr__Group__0 : rule__LogicalOrExpr__Group__0__Impl rule__LogicalOrExpr__Group__1 ;
    public final void rule__LogicalOrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2499:1: ( rule__LogicalOrExpr__Group__0__Impl rule__LogicalOrExpr__Group__1 )
            // InternalPaplj.g:2500:2: rule__LogicalOrExpr__Group__0__Impl rule__LogicalOrExpr__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__LogicalOrExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalOrExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group__0"


    // $ANTLR start "rule__LogicalOrExpr__Group__0__Impl"
    // InternalPaplj.g:2507:1: rule__LogicalOrExpr__Group__0__Impl : ( ruleLogicalAndExpr ) ;
    public final void rule__LogicalOrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2511:1: ( ( ruleLogicalAndExpr ) )
            // InternalPaplj.g:2512:1: ( ruleLogicalAndExpr )
            {
            // InternalPaplj.g:2512:1: ( ruleLogicalAndExpr )
            // InternalPaplj.g:2513:2: ruleLogicalAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExprAccess().getLogicalAndExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicalAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExprAccess().getLogicalAndExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group__0__Impl"


    // $ANTLR start "rule__LogicalOrExpr__Group__1"
    // InternalPaplj.g:2522:1: rule__LogicalOrExpr__Group__1 : rule__LogicalOrExpr__Group__1__Impl ;
    public final void rule__LogicalOrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2526:1: ( rule__LogicalOrExpr__Group__1__Impl )
            // InternalPaplj.g:2527:2: rule__LogicalOrExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group__1"


    // $ANTLR start "rule__LogicalOrExpr__Group__1__Impl"
    // InternalPaplj.g:2533:1: rule__LogicalOrExpr__Group__1__Impl : ( ( rule__LogicalOrExpr__Group_1__0 )* ) ;
    public final void rule__LogicalOrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2537:1: ( ( ( rule__LogicalOrExpr__Group_1__0 )* ) )
            // InternalPaplj.g:2538:1: ( ( rule__LogicalOrExpr__Group_1__0 )* )
            {
            // InternalPaplj.g:2538:1: ( ( rule__LogicalOrExpr__Group_1__0 )* )
            // InternalPaplj.g:2539:2: ( rule__LogicalOrExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExprAccess().getGroup_1()); 
            }
            // InternalPaplj.g:2540:2: ( rule__LogicalOrExpr__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPaplj.g:2540:3: rule__LogicalOrExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__LogicalOrExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group__1__Impl"


    // $ANTLR start "rule__LogicalOrExpr__Group_1__0"
    // InternalPaplj.g:2549:1: rule__LogicalOrExpr__Group_1__0 : rule__LogicalOrExpr__Group_1__0__Impl rule__LogicalOrExpr__Group_1__1 ;
    public final void rule__LogicalOrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2553:1: ( rule__LogicalOrExpr__Group_1__0__Impl rule__LogicalOrExpr__Group_1__1 )
            // InternalPaplj.g:2554:2: rule__LogicalOrExpr__Group_1__0__Impl rule__LogicalOrExpr__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__LogicalOrExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalOrExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group_1__0"


    // $ANTLR start "rule__LogicalOrExpr__Group_1__0__Impl"
    // InternalPaplj.g:2561:1: rule__LogicalOrExpr__Group_1__0__Impl : ( ( rule__LogicalOrExpr__Group_1_0__0 ) ) ;
    public final void rule__LogicalOrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2565:1: ( ( ( rule__LogicalOrExpr__Group_1_0__0 ) ) )
            // InternalPaplj.g:2566:1: ( ( rule__LogicalOrExpr__Group_1_0__0 ) )
            {
            // InternalPaplj.g:2566:1: ( ( rule__LogicalOrExpr__Group_1_0__0 ) )
            // InternalPaplj.g:2567:2: ( rule__LogicalOrExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExprAccess().getGroup_1_0()); 
            }
            // InternalPaplj.g:2568:2: ( rule__LogicalOrExpr__Group_1_0__0 )
            // InternalPaplj.g:2568:3: rule__LogicalOrExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalOrExpr__Group_1__1"
    // InternalPaplj.g:2576:1: rule__LogicalOrExpr__Group_1__1 : rule__LogicalOrExpr__Group_1__1__Impl ;
    public final void rule__LogicalOrExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2580:1: ( rule__LogicalOrExpr__Group_1__1__Impl )
            // InternalPaplj.g:2581:2: rule__LogicalOrExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group_1__1"


    // $ANTLR start "rule__LogicalOrExpr__Group_1__1__Impl"
    // InternalPaplj.g:2587:1: rule__LogicalOrExpr__Group_1__1__Impl : ( ( rule__LogicalOrExpr__RightAssignment_1_1 ) ) ;
    public final void rule__LogicalOrExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2591:1: ( ( ( rule__LogicalOrExpr__RightAssignment_1_1 ) ) )
            // InternalPaplj.g:2592:1: ( ( rule__LogicalOrExpr__RightAssignment_1_1 ) )
            {
            // InternalPaplj.g:2592:1: ( ( rule__LogicalOrExpr__RightAssignment_1_1 ) )
            // InternalPaplj.g:2593:2: ( rule__LogicalOrExpr__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExprAccess().getRightAssignment_1_1()); 
            }
            // InternalPaplj.g:2594:2: ( rule__LogicalOrExpr__RightAssignment_1_1 )
            // InternalPaplj.g:2594:3: rule__LogicalOrExpr__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrExpr__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExprAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalOrExpr__Group_1_0__0"
    // InternalPaplj.g:2603:1: rule__LogicalOrExpr__Group_1_0__0 : rule__LogicalOrExpr__Group_1_0__0__Impl rule__LogicalOrExpr__Group_1_0__1 ;
    public final void rule__LogicalOrExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2607:1: ( rule__LogicalOrExpr__Group_1_0__0__Impl rule__LogicalOrExpr__Group_1_0__1 )
            // InternalPaplj.g:2608:2: rule__LogicalOrExpr__Group_1_0__0__Impl rule__LogicalOrExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_23);
            rule__LogicalOrExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalOrExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group_1_0__0"


    // $ANTLR start "rule__LogicalOrExpr__Group_1_0__0__Impl"
    // InternalPaplj.g:2615:1: rule__LogicalOrExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicalOrExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2619:1: ( ( () ) )
            // InternalPaplj.g:2620:1: ( () )
            {
            // InternalPaplj.g:2620:1: ( () )
            // InternalPaplj.g:2621:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExprAccess().getOrLeftAction_1_0_0()); 
            }
            // InternalPaplj.g:2622:2: ()
            // InternalPaplj.g:2622:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExprAccess().getOrLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__LogicalOrExpr__Group_1_0__1"
    // InternalPaplj.g:2630:1: rule__LogicalOrExpr__Group_1_0__1 : rule__LogicalOrExpr__Group_1_0__1__Impl ;
    public final void rule__LogicalOrExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2634:1: ( rule__LogicalOrExpr__Group_1_0__1__Impl )
            // InternalPaplj.g:2635:2: rule__LogicalOrExpr__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group_1_0__1"


    // $ANTLR start "rule__LogicalOrExpr__Group_1_0__1__Impl"
    // InternalPaplj.g:2641:1: rule__LogicalOrExpr__Group_1_0__1__Impl : ( '||' ) ;
    public final void rule__LogicalOrExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2645:1: ( ( '||' ) )
            // InternalPaplj.g:2646:1: ( '||' )
            {
            // InternalPaplj.g:2646:1: ( '||' )
            // InternalPaplj.g:2647:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExprAccess().getVerticalLineVerticalLineKeyword_1_0_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExprAccess().getVerticalLineVerticalLineKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__LogicalAndExpr__Group__0"
    // InternalPaplj.g:2657:1: rule__LogicalAndExpr__Group__0 : rule__LogicalAndExpr__Group__0__Impl rule__LogicalAndExpr__Group__1 ;
    public final void rule__LogicalAndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2661:1: ( rule__LogicalAndExpr__Group__0__Impl rule__LogicalAndExpr__Group__1 )
            // InternalPaplj.g:2662:2: rule__LogicalAndExpr__Group__0__Impl rule__LogicalAndExpr__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__LogicalAndExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalAndExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group__0"


    // $ANTLR start "rule__LogicalAndExpr__Group__0__Impl"
    // InternalPaplj.g:2669:1: rule__LogicalAndExpr__Group__0__Impl : ( ruleComparativeExpr ) ;
    public final void rule__LogicalAndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2673:1: ( ( ruleComparativeExpr ) )
            // InternalPaplj.g:2674:1: ( ruleComparativeExpr )
            {
            // InternalPaplj.g:2674:1: ( ruleComparativeExpr )
            // InternalPaplj.g:2675:2: ruleComparativeExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExprAccess().getComparativeExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparativeExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExprAccess().getComparativeExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group__0__Impl"


    // $ANTLR start "rule__LogicalAndExpr__Group__1"
    // InternalPaplj.g:2684:1: rule__LogicalAndExpr__Group__1 : rule__LogicalAndExpr__Group__1__Impl ;
    public final void rule__LogicalAndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2688:1: ( rule__LogicalAndExpr__Group__1__Impl )
            // InternalPaplj.g:2689:2: rule__LogicalAndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group__1"


    // $ANTLR start "rule__LogicalAndExpr__Group__1__Impl"
    // InternalPaplj.g:2695:1: rule__LogicalAndExpr__Group__1__Impl : ( ( rule__LogicalAndExpr__Group_1__0 )* ) ;
    public final void rule__LogicalAndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2699:1: ( ( ( rule__LogicalAndExpr__Group_1__0 )* ) )
            // InternalPaplj.g:2700:1: ( ( rule__LogicalAndExpr__Group_1__0 )* )
            {
            // InternalPaplj.g:2700:1: ( ( rule__LogicalAndExpr__Group_1__0 )* )
            // InternalPaplj.g:2701:2: ( rule__LogicalAndExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExprAccess().getGroup_1()); 
            }
            // InternalPaplj.g:2702:2: ( rule__LogicalAndExpr__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==27) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPaplj.g:2702:3: rule__LogicalAndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__LogicalAndExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group__1__Impl"


    // $ANTLR start "rule__LogicalAndExpr__Group_1__0"
    // InternalPaplj.g:2711:1: rule__LogicalAndExpr__Group_1__0 : rule__LogicalAndExpr__Group_1__0__Impl rule__LogicalAndExpr__Group_1__1 ;
    public final void rule__LogicalAndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2715:1: ( rule__LogicalAndExpr__Group_1__0__Impl rule__LogicalAndExpr__Group_1__1 )
            // InternalPaplj.g:2716:2: rule__LogicalAndExpr__Group_1__0__Impl rule__LogicalAndExpr__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__LogicalAndExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalAndExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group_1__0"


    // $ANTLR start "rule__LogicalAndExpr__Group_1__0__Impl"
    // InternalPaplj.g:2723:1: rule__LogicalAndExpr__Group_1__0__Impl : ( ( rule__LogicalAndExpr__Group_1_0__0 ) ) ;
    public final void rule__LogicalAndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2727:1: ( ( ( rule__LogicalAndExpr__Group_1_0__0 ) ) )
            // InternalPaplj.g:2728:1: ( ( rule__LogicalAndExpr__Group_1_0__0 ) )
            {
            // InternalPaplj.g:2728:1: ( ( rule__LogicalAndExpr__Group_1_0__0 ) )
            // InternalPaplj.g:2729:2: ( rule__LogicalAndExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExprAccess().getGroup_1_0()); 
            }
            // InternalPaplj.g:2730:2: ( rule__LogicalAndExpr__Group_1_0__0 )
            // InternalPaplj.g:2730:3: rule__LogicalAndExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalAndExpr__Group_1__1"
    // InternalPaplj.g:2738:1: rule__LogicalAndExpr__Group_1__1 : rule__LogicalAndExpr__Group_1__1__Impl ;
    public final void rule__LogicalAndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2742:1: ( rule__LogicalAndExpr__Group_1__1__Impl )
            // InternalPaplj.g:2743:2: rule__LogicalAndExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group_1__1"


    // $ANTLR start "rule__LogicalAndExpr__Group_1__1__Impl"
    // InternalPaplj.g:2749:1: rule__LogicalAndExpr__Group_1__1__Impl : ( ( rule__LogicalAndExpr__RightAssignment_1_1 ) ) ;
    public final void rule__LogicalAndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2753:1: ( ( ( rule__LogicalAndExpr__RightAssignment_1_1 ) ) )
            // InternalPaplj.g:2754:1: ( ( rule__LogicalAndExpr__RightAssignment_1_1 ) )
            {
            // InternalPaplj.g:2754:1: ( ( rule__LogicalAndExpr__RightAssignment_1_1 ) )
            // InternalPaplj.g:2755:2: ( rule__LogicalAndExpr__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExprAccess().getRightAssignment_1_1()); 
            }
            // InternalPaplj.g:2756:2: ( rule__LogicalAndExpr__RightAssignment_1_1 )
            // InternalPaplj.g:2756:3: rule__LogicalAndExpr__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndExpr__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExprAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalAndExpr__Group_1_0__0"
    // InternalPaplj.g:2765:1: rule__LogicalAndExpr__Group_1_0__0 : rule__LogicalAndExpr__Group_1_0__0__Impl rule__LogicalAndExpr__Group_1_0__1 ;
    public final void rule__LogicalAndExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2769:1: ( rule__LogicalAndExpr__Group_1_0__0__Impl rule__LogicalAndExpr__Group_1_0__1 )
            // InternalPaplj.g:2770:2: rule__LogicalAndExpr__Group_1_0__0__Impl rule__LogicalAndExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__LogicalAndExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalAndExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group_1_0__0"


    // $ANTLR start "rule__LogicalAndExpr__Group_1_0__0__Impl"
    // InternalPaplj.g:2777:1: rule__LogicalAndExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicalAndExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2781:1: ( ( () ) )
            // InternalPaplj.g:2782:1: ( () )
            {
            // InternalPaplj.g:2782:1: ( () )
            // InternalPaplj.g:2783:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExprAccess().getAndLeftAction_1_0_0()); 
            }
            // InternalPaplj.g:2784:2: ()
            // InternalPaplj.g:2784:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExprAccess().getAndLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__LogicalAndExpr__Group_1_0__1"
    // InternalPaplj.g:2792:1: rule__LogicalAndExpr__Group_1_0__1 : rule__LogicalAndExpr__Group_1_0__1__Impl ;
    public final void rule__LogicalAndExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2796:1: ( rule__LogicalAndExpr__Group_1_0__1__Impl )
            // InternalPaplj.g:2797:2: rule__LogicalAndExpr__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group_1_0__1"


    // $ANTLR start "rule__LogicalAndExpr__Group_1_0__1__Impl"
    // InternalPaplj.g:2803:1: rule__LogicalAndExpr__Group_1_0__1__Impl : ( '&&' ) ;
    public final void rule__LogicalAndExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2807:1: ( ( '&&' ) )
            // InternalPaplj.g:2808:1: ( '&&' )
            {
            // InternalPaplj.g:2808:1: ( '&&' )
            // InternalPaplj.g:2809:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExprAccess().getAmpersandAmpersandKeyword_1_0_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExprAccess().getAmpersandAmpersandKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__ComparativeExpr__Group__0"
    // InternalPaplj.g:2819:1: rule__ComparativeExpr__Group__0 : rule__ComparativeExpr__Group__0__Impl rule__ComparativeExpr__Group__1 ;
    public final void rule__ComparativeExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2823:1: ( rule__ComparativeExpr__Group__0__Impl rule__ComparativeExpr__Group__1 )
            // InternalPaplj.g:2824:2: rule__ComparativeExpr__Group__0__Impl rule__ComparativeExpr__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ComparativeExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group__0"


    // $ANTLR start "rule__ComparativeExpr__Group__0__Impl"
    // InternalPaplj.g:2831:1: rule__ComparativeExpr__Group__0__Impl : ( ruleAdditiveExpr ) ;
    public final void rule__ComparativeExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2835:1: ( ( ruleAdditiveExpr ) )
            // InternalPaplj.g:2836:1: ( ruleAdditiveExpr )
            {
            // InternalPaplj.g:2836:1: ( ruleAdditiveExpr )
            // InternalPaplj.g:2837:2: ruleAdditiveExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getAdditiveExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdditiveExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getAdditiveExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group__0__Impl"


    // $ANTLR start "rule__ComparativeExpr__Group__1"
    // InternalPaplj.g:2846:1: rule__ComparativeExpr__Group__1 : rule__ComparativeExpr__Group__1__Impl ;
    public final void rule__ComparativeExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2850:1: ( rule__ComparativeExpr__Group__1__Impl )
            // InternalPaplj.g:2851:2: rule__ComparativeExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group__1"


    // $ANTLR start "rule__ComparativeExpr__Group__1__Impl"
    // InternalPaplj.g:2857:1: rule__ComparativeExpr__Group__1__Impl : ( ( rule__ComparativeExpr__Group_1__0 )? ) ;
    public final void rule__ComparativeExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2861:1: ( ( ( rule__ComparativeExpr__Group_1__0 )? ) )
            // InternalPaplj.g:2862:1: ( ( rule__ComparativeExpr__Group_1__0 )? )
            {
            // InternalPaplj.g:2862:1: ( ( rule__ComparativeExpr__Group_1__0 )? )
            // InternalPaplj.g:2863:2: ( rule__ComparativeExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getGroup_1()); 
            }
            // InternalPaplj.g:2864:2: ( rule__ComparativeExpr__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=28 && LA28_0<=30)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPaplj.g:2864:3: rule__ComparativeExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparativeExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group__1__Impl"


    // $ANTLR start "rule__ComparativeExpr__Group_1__0"
    // InternalPaplj.g:2873:1: rule__ComparativeExpr__Group_1__0 : rule__ComparativeExpr__Group_1__0__Impl rule__ComparativeExpr__Group_1__1 ;
    public final void rule__ComparativeExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2877:1: ( rule__ComparativeExpr__Group_1__0__Impl rule__ComparativeExpr__Group_1__1 )
            // InternalPaplj.g:2878:2: rule__ComparativeExpr__Group_1__0__Impl rule__ComparativeExpr__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ComparativeExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1__0"


    // $ANTLR start "rule__ComparativeExpr__Group_1__0__Impl"
    // InternalPaplj.g:2885:1: rule__ComparativeExpr__Group_1__0__Impl : ( ( rule__ComparativeExpr__Alternatives_1_0 ) ) ;
    public final void rule__ComparativeExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2889:1: ( ( ( rule__ComparativeExpr__Alternatives_1_0 ) ) )
            // InternalPaplj.g:2890:1: ( ( rule__ComparativeExpr__Alternatives_1_0 ) )
            {
            // InternalPaplj.g:2890:1: ( ( rule__ComparativeExpr__Alternatives_1_0 ) )
            // InternalPaplj.g:2891:2: ( rule__ComparativeExpr__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getAlternatives_1_0()); 
            }
            // InternalPaplj.g:2892:2: ( rule__ComparativeExpr__Alternatives_1_0 )
            // InternalPaplj.g:2892:3: rule__ComparativeExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1__0__Impl"


    // $ANTLR start "rule__ComparativeExpr__Group_1__1"
    // InternalPaplj.g:2900:1: rule__ComparativeExpr__Group_1__1 : rule__ComparativeExpr__Group_1__1__Impl ;
    public final void rule__ComparativeExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2904:1: ( rule__ComparativeExpr__Group_1__1__Impl )
            // InternalPaplj.g:2905:2: rule__ComparativeExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1__1"


    // $ANTLR start "rule__ComparativeExpr__Group_1__1__Impl"
    // InternalPaplj.g:2911:1: rule__ComparativeExpr__Group_1__1__Impl : ( ( rule__ComparativeExpr__RightAssignment_1_1 ) ) ;
    public final void rule__ComparativeExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2915:1: ( ( ( rule__ComparativeExpr__RightAssignment_1_1 ) ) )
            // InternalPaplj.g:2916:1: ( ( rule__ComparativeExpr__RightAssignment_1_1 ) )
            {
            // InternalPaplj.g:2916:1: ( ( rule__ComparativeExpr__RightAssignment_1_1 ) )
            // InternalPaplj.g:2917:2: ( rule__ComparativeExpr__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getRightAssignment_1_1()); 
            }
            // InternalPaplj.g:2918:2: ( rule__ComparativeExpr__RightAssignment_1_1 )
            // InternalPaplj.g:2918:3: rule__ComparativeExpr__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1__1__Impl"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_0__0"
    // InternalPaplj.g:2927:1: rule__ComparativeExpr__Group_1_0_0__0 : rule__ComparativeExpr__Group_1_0_0__0__Impl rule__ComparativeExpr__Group_1_0_0__1 ;
    public final void rule__ComparativeExpr__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2931:1: ( rule__ComparativeExpr__Group_1_0_0__0__Impl rule__ComparativeExpr__Group_1_0_0__1 )
            // InternalPaplj.g:2932:2: rule__ComparativeExpr__Group_1_0_0__0__Impl rule__ComparativeExpr__Group_1_0_0__1
            {
            pushFollow(FOLLOW_28);
            rule__ComparativeExpr__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_0__0"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_0__0__Impl"
    // InternalPaplj.g:2939:1: rule__ComparativeExpr__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ComparativeExpr__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2943:1: ( ( () ) )
            // InternalPaplj.g:2944:1: ( () )
            {
            // InternalPaplj.g:2944:1: ( () )
            // InternalPaplj.g:2945:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getEqLeftAction_1_0_0_0()); 
            }
            // InternalPaplj.g:2946:2: ()
            // InternalPaplj.g:2946:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getEqLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_0__1"
    // InternalPaplj.g:2954:1: rule__ComparativeExpr__Group_1_0_0__1 : rule__ComparativeExpr__Group_1_0_0__1__Impl ;
    public final void rule__ComparativeExpr__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2958:1: ( rule__ComparativeExpr__Group_1_0_0__1__Impl )
            // InternalPaplj.g:2959:2: rule__ComparativeExpr__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_0__1"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_0__1__Impl"
    // InternalPaplj.g:2965:1: rule__ComparativeExpr__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__ComparativeExpr__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2969:1: ( ( '==' ) )
            // InternalPaplj.g:2970:1: ( '==' )
            {
            // InternalPaplj.g:2970:1: ( '==' )
            // InternalPaplj.g:2971:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_1__0"
    // InternalPaplj.g:2981:1: rule__ComparativeExpr__Group_1_0_1__0 : rule__ComparativeExpr__Group_1_0_1__0__Impl rule__ComparativeExpr__Group_1_0_1__1 ;
    public final void rule__ComparativeExpr__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2985:1: ( rule__ComparativeExpr__Group_1_0_1__0__Impl rule__ComparativeExpr__Group_1_0_1__1 )
            // InternalPaplj.g:2986:2: rule__ComparativeExpr__Group_1_0_1__0__Impl rule__ComparativeExpr__Group_1_0_1__1
            {
            pushFollow(FOLLOW_29);
            rule__ComparativeExpr__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_1__0"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_1__0__Impl"
    // InternalPaplj.g:2993:1: rule__ComparativeExpr__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__ComparativeExpr__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:2997:1: ( ( () ) )
            // InternalPaplj.g:2998:1: ( () )
            {
            // InternalPaplj.g:2998:1: ( () )
            // InternalPaplj.g:2999:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getNeqLeftAction_1_0_1_0()); 
            }
            // InternalPaplj.g:3000:2: ()
            // InternalPaplj.g:3000:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getNeqLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_1__1"
    // InternalPaplj.g:3008:1: rule__ComparativeExpr__Group_1_0_1__1 : rule__ComparativeExpr__Group_1_0_1__1__Impl ;
    public final void rule__ComparativeExpr__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3012:1: ( rule__ComparativeExpr__Group_1_0_1__1__Impl )
            // InternalPaplj.g:3013:2: rule__ComparativeExpr__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_1__1"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_1__1__Impl"
    // InternalPaplj.g:3019:1: rule__ComparativeExpr__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__ComparativeExpr__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3023:1: ( ( '!=' ) )
            // InternalPaplj.g:3024:1: ( '!=' )
            {
            // InternalPaplj.g:3024:1: ( '!=' )
            // InternalPaplj.g:3025:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_2__0"
    // InternalPaplj.g:3035:1: rule__ComparativeExpr__Group_1_0_2__0 : rule__ComparativeExpr__Group_1_0_2__0__Impl rule__ComparativeExpr__Group_1_0_2__1 ;
    public final void rule__ComparativeExpr__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3039:1: ( rule__ComparativeExpr__Group_1_0_2__0__Impl rule__ComparativeExpr__Group_1_0_2__1 )
            // InternalPaplj.g:3040:2: rule__ComparativeExpr__Group_1_0_2__0__Impl rule__ComparativeExpr__Group_1_0_2__1
            {
            pushFollow(FOLLOW_27);
            rule__ComparativeExpr__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group_1_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_2__0"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_2__0__Impl"
    // InternalPaplj.g:3047:1: rule__ComparativeExpr__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__ComparativeExpr__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3051:1: ( ( () ) )
            // InternalPaplj.g:3052:1: ( () )
            {
            // InternalPaplj.g:3052:1: ( () )
            // InternalPaplj.g:3053:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getLtLeftAction_1_0_2_0()); 
            }
            // InternalPaplj.g:3054:2: ()
            // InternalPaplj.g:3054:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getLtLeftAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_2__1"
    // InternalPaplj.g:3062:1: rule__ComparativeExpr__Group_1_0_2__1 : rule__ComparativeExpr__Group_1_0_2__1__Impl ;
    public final void rule__ComparativeExpr__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3066:1: ( rule__ComparativeExpr__Group_1_0_2__1__Impl )
            // InternalPaplj.g:3067:2: rule__ComparativeExpr__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpr__Group_1_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_2__1"


    // $ANTLR start "rule__ComparativeExpr__Group_1_0_2__1__Impl"
    // InternalPaplj.g:3073:1: rule__ComparativeExpr__Group_1_0_2__1__Impl : ( '<' ) ;
    public final void rule__ComparativeExpr__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3077:1: ( ( '<' ) )
            // InternalPaplj.g:3078:1: ( '<' )
            {
            // InternalPaplj.g:3078:1: ( '<' )
            // InternalPaplj.g:3079:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getLessThanSignKeyword_1_0_2_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getLessThanSignKeyword_1_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__AdditiveExpr__Group__0"
    // InternalPaplj.g:3089:1: rule__AdditiveExpr__Group__0 : rule__AdditiveExpr__Group__0__Impl rule__AdditiveExpr__Group__1 ;
    public final void rule__AdditiveExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3093:1: ( rule__AdditiveExpr__Group__0__Impl rule__AdditiveExpr__Group__1 )
            // InternalPaplj.g:3094:2: rule__AdditiveExpr__Group__0__Impl rule__AdditiveExpr__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__AdditiveExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group__0"


    // $ANTLR start "rule__AdditiveExpr__Group__0__Impl"
    // InternalPaplj.g:3101:1: rule__AdditiveExpr__Group__0__Impl : ( ruleMultiplicativeExpr ) ;
    public final void rule__AdditiveExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3105:1: ( ( ruleMultiplicativeExpr ) )
            // InternalPaplj.g:3106:1: ( ruleMultiplicativeExpr )
            {
            // InternalPaplj.g:3106:1: ( ruleMultiplicativeExpr )
            // InternalPaplj.g:3107:2: ruleMultiplicativeExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprAccess().getMultiplicativeExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprAccess().getMultiplicativeExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpr__Group__1"
    // InternalPaplj.g:3116:1: rule__AdditiveExpr__Group__1 : rule__AdditiveExpr__Group__1__Impl ;
    public final void rule__AdditiveExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3120:1: ( rule__AdditiveExpr__Group__1__Impl )
            // InternalPaplj.g:3121:2: rule__AdditiveExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group__1"


    // $ANTLR start "rule__AdditiveExpr__Group__1__Impl"
    // InternalPaplj.g:3127:1: rule__AdditiveExpr__Group__1__Impl : ( ( rule__AdditiveExpr__Group_1__0 )* ) ;
    public final void rule__AdditiveExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3131:1: ( ( ( rule__AdditiveExpr__Group_1__0 )* ) )
            // InternalPaplj.g:3132:1: ( ( rule__AdditiveExpr__Group_1__0 )* )
            {
            // InternalPaplj.g:3132:1: ( ( rule__AdditiveExpr__Group_1__0 )* )
            // InternalPaplj.g:3133:2: ( rule__AdditiveExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprAccess().getGroup_1()); 
            }
            // InternalPaplj.g:3134:2: ( rule__AdditiveExpr__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=31 && LA29_0<=32)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPaplj.g:3134:3: rule__AdditiveExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__AdditiveExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpr__Group_1__0"
    // InternalPaplj.g:3143:1: rule__AdditiveExpr__Group_1__0 : rule__AdditiveExpr__Group_1__0__Impl rule__AdditiveExpr__Group_1__1 ;
    public final void rule__AdditiveExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3147:1: ( rule__AdditiveExpr__Group_1__0__Impl rule__AdditiveExpr__Group_1__1 )
            // InternalPaplj.g:3148:2: rule__AdditiveExpr__Group_1__0__Impl rule__AdditiveExpr__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__AdditiveExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1__0"


    // $ANTLR start "rule__AdditiveExpr__Group_1__0__Impl"
    // InternalPaplj.g:3155:1: rule__AdditiveExpr__Group_1__0__Impl : ( ( rule__AdditiveExpr__Alternatives_1_0 ) ) ;
    public final void rule__AdditiveExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3159:1: ( ( ( rule__AdditiveExpr__Alternatives_1_0 ) ) )
            // InternalPaplj.g:3160:1: ( ( rule__AdditiveExpr__Alternatives_1_0 ) )
            {
            // InternalPaplj.g:3160:1: ( ( rule__AdditiveExpr__Alternatives_1_0 ) )
            // InternalPaplj.g:3161:2: ( rule__AdditiveExpr__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprAccess().getAlternatives_1_0()); 
            }
            // InternalPaplj.g:3162:2: ( rule__AdditiveExpr__Alternatives_1_0 )
            // InternalPaplj.g:3162:3: rule__AdditiveExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpr__Group_1__1"
    // InternalPaplj.g:3170:1: rule__AdditiveExpr__Group_1__1 : rule__AdditiveExpr__Group_1__1__Impl ;
    public final void rule__AdditiveExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3174:1: ( rule__AdditiveExpr__Group_1__1__Impl )
            // InternalPaplj.g:3175:2: rule__AdditiveExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1__1"


    // $ANTLR start "rule__AdditiveExpr__Group_1__1__Impl"
    // InternalPaplj.g:3181:1: rule__AdditiveExpr__Group_1__1__Impl : ( ( rule__AdditiveExpr__RightAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3185:1: ( ( ( rule__AdditiveExpr__RightAssignment_1_1 ) ) )
            // InternalPaplj.g:3186:1: ( ( rule__AdditiveExpr__RightAssignment_1_1 ) )
            {
            // InternalPaplj.g:3186:1: ( ( rule__AdditiveExpr__RightAssignment_1_1 ) )
            // InternalPaplj.g:3187:2: ( rule__AdditiveExpr__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprAccess().getRightAssignment_1_1()); 
            }
            // InternalPaplj.g:3188:2: ( rule__AdditiveExpr__RightAssignment_1_1 )
            // InternalPaplj.g:3188:3: rule__AdditiveExpr__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpr__Group_1_0_0__0"
    // InternalPaplj.g:3197:1: rule__AdditiveExpr__Group_1_0_0__0 : rule__AdditiveExpr__Group_1_0_0__0__Impl rule__AdditiveExpr__Group_1_0_0__1 ;
    public final void rule__AdditiveExpr__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3201:1: ( rule__AdditiveExpr__Group_1_0_0__0__Impl rule__AdditiveExpr__Group_1_0_0__1 )
            // InternalPaplj.g:3202:2: rule__AdditiveExpr__Group_1_0_0__0__Impl rule__AdditiveExpr__Group_1_0_0__1
            {
            pushFollow(FOLLOW_32);
            rule__AdditiveExpr__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1_0_0__0"


    // $ANTLR start "rule__AdditiveExpr__Group_1_0_0__0__Impl"
    // InternalPaplj.g:3209:1: rule__AdditiveExpr__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AdditiveExpr__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3213:1: ( ( () ) )
            // InternalPaplj.g:3214:1: ( () )
            {
            // InternalPaplj.g:3214:1: ( () )
            // InternalPaplj.g:3215:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprAccess().getAddLeftAction_1_0_0_0()); 
            }
            // InternalPaplj.g:3216:2: ()
            // InternalPaplj.g:3216:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprAccess().getAddLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AdditiveExpr__Group_1_0_0__1"
    // InternalPaplj.g:3224:1: rule__AdditiveExpr__Group_1_0_0__1 : rule__AdditiveExpr__Group_1_0_0__1__Impl ;
    public final void rule__AdditiveExpr__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3228:1: ( rule__AdditiveExpr__Group_1_0_0__1__Impl )
            // InternalPaplj.g:3229:2: rule__AdditiveExpr__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1_0_0__1"


    // $ANTLR start "rule__AdditiveExpr__Group_1_0_0__1__Impl"
    // InternalPaplj.g:3235:1: rule__AdditiveExpr__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__AdditiveExpr__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3239:1: ( ( '+' ) )
            // InternalPaplj.g:3240:1: ( '+' )
            {
            // InternalPaplj.g:3240:1: ( '+' )
            // InternalPaplj.g:3241:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprAccess().getPlusSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AdditiveExpr__Group_1_0_1__0"
    // InternalPaplj.g:3251:1: rule__AdditiveExpr__Group_1_0_1__0 : rule__AdditiveExpr__Group_1_0_1__0__Impl rule__AdditiveExpr__Group_1_0_1__1 ;
    public final void rule__AdditiveExpr__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3255:1: ( rule__AdditiveExpr__Group_1_0_1__0__Impl rule__AdditiveExpr__Group_1_0_1__1 )
            // InternalPaplj.g:3256:2: rule__AdditiveExpr__Group_1_0_1__0__Impl rule__AdditiveExpr__Group_1_0_1__1
            {
            pushFollow(FOLLOW_30);
            rule__AdditiveExpr__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1_0_1__0"


    // $ANTLR start "rule__AdditiveExpr__Group_1_0_1__0__Impl"
    // InternalPaplj.g:3263:1: rule__AdditiveExpr__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpr__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3267:1: ( ( () ) )
            // InternalPaplj.g:3268:1: ( () )
            {
            // InternalPaplj.g:3268:1: ( () )
            // InternalPaplj.g:3269:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprAccess().getSubLeftAction_1_0_1_0()); 
            }
            // InternalPaplj.g:3270:2: ()
            // InternalPaplj.g:3270:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprAccess().getSubLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpr__Group_1_0_1__1"
    // InternalPaplj.g:3278:1: rule__AdditiveExpr__Group_1_0_1__1 : rule__AdditiveExpr__Group_1_0_1__1__Impl ;
    public final void rule__AdditiveExpr__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3282:1: ( rule__AdditiveExpr__Group_1_0_1__1__Impl )
            // InternalPaplj.g:3283:2: rule__AdditiveExpr__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpr__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1_0_1__1"


    // $ANTLR start "rule__AdditiveExpr__Group_1_0_1__1__Impl"
    // InternalPaplj.g:3289:1: rule__AdditiveExpr__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__AdditiveExpr__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3293:1: ( ( '-' ) )
            // InternalPaplj.g:3294:1: ( '-' )
            {
            // InternalPaplj.g:3294:1: ( '-' )
            // InternalPaplj.g:3295:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpr__Group__0"
    // InternalPaplj.g:3305:1: rule__MultiplicativeExpr__Group__0 : rule__MultiplicativeExpr__Group__0__Impl rule__MultiplicativeExpr__Group__1 ;
    public final void rule__MultiplicativeExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3309:1: ( rule__MultiplicativeExpr__Group__0__Impl rule__MultiplicativeExpr__Group__1 )
            // InternalPaplj.g:3310:2: rule__MultiplicativeExpr__Group__0__Impl rule__MultiplicativeExpr__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__MultiplicativeExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group__0"


    // $ANTLR start "rule__MultiplicativeExpr__Group__0__Impl"
    // InternalPaplj.g:3317:1: rule__MultiplicativeExpr__Group__0__Impl : ( ruleUnaryExpr ) ;
    public final void rule__MultiplicativeExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3321:1: ( ( ruleUnaryExpr ) )
            // InternalPaplj.g:3322:1: ( ruleUnaryExpr )
            {
            // InternalPaplj.g:3322:1: ( ruleUnaryExpr )
            // InternalPaplj.g:3323:2: ruleUnaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprAccess().getUnaryExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprAccess().getUnaryExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpr__Group__1"
    // InternalPaplj.g:3332:1: rule__MultiplicativeExpr__Group__1 : rule__MultiplicativeExpr__Group__1__Impl ;
    public final void rule__MultiplicativeExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3336:1: ( rule__MultiplicativeExpr__Group__1__Impl )
            // InternalPaplj.g:3337:2: rule__MultiplicativeExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group__1"


    // $ANTLR start "rule__MultiplicativeExpr__Group__1__Impl"
    // InternalPaplj.g:3343:1: rule__MultiplicativeExpr__Group__1__Impl : ( ( rule__MultiplicativeExpr__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3347:1: ( ( ( rule__MultiplicativeExpr__Group_1__0 )* ) )
            // InternalPaplj.g:3348:1: ( ( rule__MultiplicativeExpr__Group_1__0 )* )
            {
            // InternalPaplj.g:3348:1: ( ( rule__MultiplicativeExpr__Group_1__0 )* )
            // InternalPaplj.g:3349:2: ( rule__MultiplicativeExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprAccess().getGroup_1()); 
            }
            // InternalPaplj.g:3350:2: ( rule__MultiplicativeExpr__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=33 && LA30_0<=34)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPaplj.g:3350:3: rule__MultiplicativeExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__MultiplicativeExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1__0"
    // InternalPaplj.g:3359:1: rule__MultiplicativeExpr__Group_1__0 : rule__MultiplicativeExpr__Group_1__0__Impl rule__MultiplicativeExpr__Group_1__1 ;
    public final void rule__MultiplicativeExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3363:1: ( rule__MultiplicativeExpr__Group_1__0__Impl rule__MultiplicativeExpr__Group_1__1 )
            // InternalPaplj.g:3364:2: rule__MultiplicativeExpr__Group_1__0__Impl rule__MultiplicativeExpr__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__MultiplicativeExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1__0__Impl"
    // InternalPaplj.g:3371:1: rule__MultiplicativeExpr__Group_1__0__Impl : ( ( rule__MultiplicativeExpr__Alternatives_1_0 ) ) ;
    public final void rule__MultiplicativeExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3375:1: ( ( ( rule__MultiplicativeExpr__Alternatives_1_0 ) ) )
            // InternalPaplj.g:3376:1: ( ( rule__MultiplicativeExpr__Alternatives_1_0 ) )
            {
            // InternalPaplj.g:3376:1: ( ( rule__MultiplicativeExpr__Alternatives_1_0 ) )
            // InternalPaplj.g:3377:2: ( rule__MultiplicativeExpr__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprAccess().getAlternatives_1_0()); 
            }
            // InternalPaplj.g:3378:2: ( rule__MultiplicativeExpr__Alternatives_1_0 )
            // InternalPaplj.g:3378:3: rule__MultiplicativeExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1__1"
    // InternalPaplj.g:3386:1: rule__MultiplicativeExpr__Group_1__1 : rule__MultiplicativeExpr__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3390:1: ( rule__MultiplicativeExpr__Group_1__1__Impl )
            // InternalPaplj.g:3391:2: rule__MultiplicativeExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1__1__Impl"
    // InternalPaplj.g:3397:1: rule__MultiplicativeExpr__Group_1__1__Impl : ( ( rule__MultiplicativeExpr__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3401:1: ( ( ( rule__MultiplicativeExpr__RightAssignment_1_1 ) ) )
            // InternalPaplj.g:3402:1: ( ( rule__MultiplicativeExpr__RightAssignment_1_1 ) )
            {
            // InternalPaplj.g:3402:1: ( ( rule__MultiplicativeExpr__RightAssignment_1_1 ) )
            // InternalPaplj.g:3403:2: ( rule__MultiplicativeExpr__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprAccess().getRightAssignment_1_1()); 
            }
            // InternalPaplj.g:3404:2: ( rule__MultiplicativeExpr__RightAssignment_1_1 )
            // InternalPaplj.g:3404:3: rule__MultiplicativeExpr__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1_0_0__0"
    // InternalPaplj.g:3413:1: rule__MultiplicativeExpr__Group_1_0_0__0 : rule__MultiplicativeExpr__Group_1_0_0__0__Impl rule__MultiplicativeExpr__Group_1_0_0__1 ;
    public final void rule__MultiplicativeExpr__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3417:1: ( rule__MultiplicativeExpr__Group_1_0_0__0__Impl rule__MultiplicativeExpr__Group_1_0_0__1 )
            // InternalPaplj.g:3418:2: rule__MultiplicativeExpr__Group_1_0_0__0__Impl rule__MultiplicativeExpr__Group_1_0_0__1
            {
            pushFollow(FOLLOW_35);
            rule__MultiplicativeExpr__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1_0_0__0"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1_0_0__0__Impl"
    // InternalPaplj.g:3425:1: rule__MultiplicativeExpr__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpr__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3429:1: ( ( () ) )
            // InternalPaplj.g:3430:1: ( () )
            {
            // InternalPaplj.g:3430:1: ( () )
            // InternalPaplj.g:3431:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprAccess().getMulLeftAction_1_0_0_0()); 
            }
            // InternalPaplj.g:3432:2: ()
            // InternalPaplj.g:3432:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprAccess().getMulLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1_0_0__1"
    // InternalPaplj.g:3440:1: rule__MultiplicativeExpr__Group_1_0_0__1 : rule__MultiplicativeExpr__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicativeExpr__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3444:1: ( rule__MultiplicativeExpr__Group_1_0_0__1__Impl )
            // InternalPaplj.g:3445:2: rule__MultiplicativeExpr__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1_0_0__1"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1_0_0__1__Impl"
    // InternalPaplj.g:3451:1: rule__MultiplicativeExpr__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultiplicativeExpr__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3455:1: ( ( '*' ) )
            // InternalPaplj.g:3456:1: ( '*' )
            {
            // InternalPaplj.g:3456:1: ( '*' )
            // InternalPaplj.g:3457:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprAccess().getAsteriskKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1_0_1__0"
    // InternalPaplj.g:3467:1: rule__MultiplicativeExpr__Group_1_0_1__0 : rule__MultiplicativeExpr__Group_1_0_1__0__Impl rule__MultiplicativeExpr__Group_1_0_1__1 ;
    public final void rule__MultiplicativeExpr__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3471:1: ( rule__MultiplicativeExpr__Group_1_0_1__0__Impl rule__MultiplicativeExpr__Group_1_0_1__1 )
            // InternalPaplj.g:3472:2: rule__MultiplicativeExpr__Group_1_0_1__0__Impl rule__MultiplicativeExpr__Group_1_0_1__1
            {
            pushFollow(FOLLOW_33);
            rule__MultiplicativeExpr__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1_0_1__0"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1_0_1__0__Impl"
    // InternalPaplj.g:3479:1: rule__MultiplicativeExpr__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpr__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3483:1: ( ( () ) )
            // InternalPaplj.g:3484:1: ( () )
            {
            // InternalPaplj.g:3484:1: ( () )
            // InternalPaplj.g:3485:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprAccess().getDivLeftAction_1_0_1_0()); 
            }
            // InternalPaplj.g:3486:2: ()
            // InternalPaplj.g:3486:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprAccess().getDivLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1_0_1__1"
    // InternalPaplj.g:3494:1: rule__MultiplicativeExpr__Group_1_0_1__1 : rule__MultiplicativeExpr__Group_1_0_1__1__Impl ;
    public final void rule__MultiplicativeExpr__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3498:1: ( rule__MultiplicativeExpr__Group_1_0_1__1__Impl )
            // InternalPaplj.g:3499:2: rule__MultiplicativeExpr__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpr__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1_0_1__1"


    // $ANTLR start "rule__MultiplicativeExpr__Group_1_0_1__1__Impl"
    // InternalPaplj.g:3505:1: rule__MultiplicativeExpr__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultiplicativeExpr__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3509:1: ( ( '/' ) )
            // InternalPaplj.g:3510:1: ( '/' )
            {
            // InternalPaplj.g:3510:1: ( '/' )
            // InternalPaplj.g:3511:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprAccess().getSolidusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_0__0"
    // InternalPaplj.g:3521:1: rule__UnaryExpr__Group_0__0 : rule__UnaryExpr__Group_0__0__Impl rule__UnaryExpr__Group_0__1 ;
    public final void rule__UnaryExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3525:1: ( rule__UnaryExpr__Group_0__0__Impl rule__UnaryExpr__Group_0__1 )
            // InternalPaplj.g:3526:2: rule__UnaryExpr__Group_0__0__Impl rule__UnaryExpr__Group_0__1
            {
            pushFollow(FOLLOW_36);
            rule__UnaryExpr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0__0"


    // $ANTLR start "rule__UnaryExpr__Group_0__0__Impl"
    // InternalPaplj.g:3533:1: rule__UnaryExpr__Group_0__0__Impl : ( ruleMemberExpr ) ;
    public final void rule__UnaryExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3537:1: ( ( ruleMemberExpr ) )
            // InternalPaplj.g:3538:1: ( ruleMemberExpr )
            {
            // InternalPaplj.g:3538:1: ( ruleMemberExpr )
            // InternalPaplj.g:3539:2: ruleMemberExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getMemberExprParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMemberExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getMemberExprParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_0__1"
    // InternalPaplj.g:3548:1: rule__UnaryExpr__Group_0__1 : rule__UnaryExpr__Group_0__1__Impl ;
    public final void rule__UnaryExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3552:1: ( rule__UnaryExpr__Group_0__1__Impl )
            // InternalPaplj.g:3553:2: rule__UnaryExpr__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0__1"


    // $ANTLR start "rule__UnaryExpr__Group_0__1__Impl"
    // InternalPaplj.g:3559:1: rule__UnaryExpr__Group_0__1__Impl : ( ( rule__UnaryExpr__Group_0_1__0 )? ) ;
    public final void rule__UnaryExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3563:1: ( ( ( rule__UnaryExpr__Group_0_1__0 )? ) )
            // InternalPaplj.g:3564:1: ( ( rule__UnaryExpr__Group_0_1__0 )? )
            {
            // InternalPaplj.g:3564:1: ( ( rule__UnaryExpr__Group_0_1__0 )? )
            // InternalPaplj.g:3565:2: ( rule__UnaryExpr__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getGroup_0_1()); 
            }
            // InternalPaplj.g:3566:2: ( rule__UnaryExpr__Group_0_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPaplj.g:3566:3: rule__UnaryExpr__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpr__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_0_1__0"
    // InternalPaplj.g:3575:1: rule__UnaryExpr__Group_0_1__0 : rule__UnaryExpr__Group_0_1__0__Impl rule__UnaryExpr__Group_0_1__1 ;
    public final void rule__UnaryExpr__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3579:1: ( rule__UnaryExpr__Group_0_1__0__Impl rule__UnaryExpr__Group_0_1__1 )
            // InternalPaplj.g:3580:2: rule__UnaryExpr__Group_0_1__0__Impl rule__UnaryExpr__Group_0_1__1
            {
            pushFollow(FOLLOW_6);
            rule__UnaryExpr__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0_1__0"


    // $ANTLR start "rule__UnaryExpr__Group_0_1__0__Impl"
    // InternalPaplj.g:3587:1: rule__UnaryExpr__Group_0_1__0__Impl : ( ( rule__UnaryExpr__Group_0_1_0__0 ) ) ;
    public final void rule__UnaryExpr__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3591:1: ( ( ( rule__UnaryExpr__Group_0_1_0__0 ) ) )
            // InternalPaplj.g:3592:1: ( ( rule__UnaryExpr__Group_0_1_0__0 ) )
            {
            // InternalPaplj.g:3592:1: ( ( rule__UnaryExpr__Group_0_1_0__0 ) )
            // InternalPaplj.g:3593:2: ( rule__UnaryExpr__Group_0_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getGroup_0_1_0()); 
            }
            // InternalPaplj.g:3594:2: ( rule__UnaryExpr__Group_0_1_0__0 )
            // InternalPaplj.g:3594:3: rule__UnaryExpr__Group_0_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_0_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getGroup_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0_1__0__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_0_1__1"
    // InternalPaplj.g:3602:1: rule__UnaryExpr__Group_0_1__1 : rule__UnaryExpr__Group_0_1__1__Impl ;
    public final void rule__UnaryExpr__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3606:1: ( rule__UnaryExpr__Group_0_1__1__Impl )
            // InternalPaplj.g:3607:2: rule__UnaryExpr__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0_1__1"


    // $ANTLR start "rule__UnaryExpr__Group_0_1__1__Impl"
    // InternalPaplj.g:3613:1: rule__UnaryExpr__Group_0_1__1__Impl : ( ( rule__UnaryExpr__TypeAssignment_0_1_1 ) ) ;
    public final void rule__UnaryExpr__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3617:1: ( ( ( rule__UnaryExpr__TypeAssignment_0_1_1 ) ) )
            // InternalPaplj.g:3618:1: ( ( rule__UnaryExpr__TypeAssignment_0_1_1 ) )
            {
            // InternalPaplj.g:3618:1: ( ( rule__UnaryExpr__TypeAssignment_0_1_1 ) )
            // InternalPaplj.g:3619:2: ( rule__UnaryExpr__TypeAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getTypeAssignment_0_1_1()); 
            }
            // InternalPaplj.g:3620:2: ( rule__UnaryExpr__TypeAssignment_0_1_1 )
            // InternalPaplj.g:3620:3: rule__UnaryExpr__TypeAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__TypeAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getTypeAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0_1__1__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_0_1_0__0"
    // InternalPaplj.g:3629:1: rule__UnaryExpr__Group_0_1_0__0 : rule__UnaryExpr__Group_0_1_0__0__Impl rule__UnaryExpr__Group_0_1_0__1 ;
    public final void rule__UnaryExpr__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3633:1: ( rule__UnaryExpr__Group_0_1_0__0__Impl rule__UnaryExpr__Group_0_1_0__1 )
            // InternalPaplj.g:3634:2: rule__UnaryExpr__Group_0_1_0__0__Impl rule__UnaryExpr__Group_0_1_0__1
            {
            pushFollow(FOLLOW_36);
            rule__UnaryExpr__Group_0_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_0_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0_1_0__0"


    // $ANTLR start "rule__UnaryExpr__Group_0_1_0__0__Impl"
    // InternalPaplj.g:3641:1: rule__UnaryExpr__Group_0_1_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpr__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3645:1: ( ( () ) )
            // InternalPaplj.g:3646:1: ( () )
            {
            // InternalPaplj.g:3646:1: ( () )
            // InternalPaplj.g:3647:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getCastLeftAction_0_1_0_0()); 
            }
            // InternalPaplj.g:3648:2: ()
            // InternalPaplj.g:3648:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getCastLeftAction_0_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0_1_0__0__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_0_1_0__1"
    // InternalPaplj.g:3656:1: rule__UnaryExpr__Group_0_1_0__1 : rule__UnaryExpr__Group_0_1_0__1__Impl ;
    public final void rule__UnaryExpr__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3660:1: ( rule__UnaryExpr__Group_0_1_0__1__Impl )
            // InternalPaplj.g:3661:2: rule__UnaryExpr__Group_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_0_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0_1_0__1"


    // $ANTLR start "rule__UnaryExpr__Group_0_1_0__1__Impl"
    // InternalPaplj.g:3667:1: rule__UnaryExpr__Group_0_1_0__1__Impl : ( 'as' ) ;
    public final void rule__UnaryExpr__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3671:1: ( ( 'as' ) )
            // InternalPaplj.g:3672:1: ( 'as' )
            {
            // InternalPaplj.g:3672:1: ( 'as' )
            // InternalPaplj.g:3673:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getAsKeyword_0_1_0_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getAsKeyword_0_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_0_1_0__1__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_1__0"
    // InternalPaplj.g:3683:1: rule__UnaryExpr__Group_1__0 : rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1 ;
    public final void rule__UnaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3687:1: ( rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1 )
            // InternalPaplj.g:3688:2: rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__UnaryExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_1__0"


    // $ANTLR start "rule__UnaryExpr__Group_1__0__Impl"
    // InternalPaplj.g:3695:1: rule__UnaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3699:1: ( ( () ) )
            // InternalPaplj.g:3700:1: ( () )
            {
            // InternalPaplj.g:3700:1: ( () )
            // InternalPaplj.g:3701:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getNotAction_1_0()); 
            }
            // InternalPaplj.g:3702:2: ()
            // InternalPaplj.g:3702:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getNotAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_1__1"
    // InternalPaplj.g:3710:1: rule__UnaryExpr__Group_1__1 : rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2 ;
    public final void rule__UnaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3714:1: ( rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2 )
            // InternalPaplj.g:3715:2: rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__UnaryExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_1__1"


    // $ANTLR start "rule__UnaryExpr__Group_1__1__Impl"
    // InternalPaplj.g:3722:1: rule__UnaryExpr__Group_1__1__Impl : ( '!' ) ;
    public final void rule__UnaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3726:1: ( ( '!' ) )
            // InternalPaplj.g:3727:1: ( '!' )
            {
            // InternalPaplj.g:3727:1: ( '!' )
            // InternalPaplj.g:3728:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getExclamationMarkKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_1__2"
    // InternalPaplj.g:3737:1: rule__UnaryExpr__Group_1__2 : rule__UnaryExpr__Group_1__2__Impl ;
    public final void rule__UnaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3741:1: ( rule__UnaryExpr__Group_1__2__Impl )
            // InternalPaplj.g:3742:2: rule__UnaryExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_1__2"


    // $ANTLR start "rule__UnaryExpr__Group_1__2__Impl"
    // InternalPaplj.g:3748:1: rule__UnaryExpr__Group_1__2__Impl : ( ( rule__UnaryExpr__ExprAssignment_1_2 ) ) ;
    public final void rule__UnaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3752:1: ( ( ( rule__UnaryExpr__ExprAssignment_1_2 ) ) )
            // InternalPaplj.g:3753:1: ( ( rule__UnaryExpr__ExprAssignment_1_2 ) )
            {
            // InternalPaplj.g:3753:1: ( ( rule__UnaryExpr__ExprAssignment_1_2 ) )
            // InternalPaplj.g:3754:2: ( rule__UnaryExpr__ExprAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getExprAssignment_1_2()); 
            }
            // InternalPaplj.g:3755:2: ( rule__UnaryExpr__ExprAssignment_1_2 )
            // InternalPaplj.g:3755:3: rule__UnaryExpr__ExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__ExprAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getExprAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_2__0"
    // InternalPaplj.g:3764:1: rule__UnaryExpr__Group_2__0 : rule__UnaryExpr__Group_2__0__Impl rule__UnaryExpr__Group_2__1 ;
    public final void rule__UnaryExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3768:1: ( rule__UnaryExpr__Group_2__0__Impl rule__UnaryExpr__Group_2__1 )
            // InternalPaplj.g:3769:2: rule__UnaryExpr__Group_2__0__Impl rule__UnaryExpr__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__UnaryExpr__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_2__0"


    // $ANTLR start "rule__UnaryExpr__Group_2__0__Impl"
    // InternalPaplj.g:3776:1: rule__UnaryExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3780:1: ( ( () ) )
            // InternalPaplj.g:3781:1: ( () )
            {
            // InternalPaplj.g:3781:1: ( () )
            // InternalPaplj.g:3782:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getMinAction_2_0()); 
            }
            // InternalPaplj.g:3783:2: ()
            // InternalPaplj.g:3783:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getMinAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_2__0__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_2__1"
    // InternalPaplj.g:3791:1: rule__UnaryExpr__Group_2__1 : rule__UnaryExpr__Group_2__1__Impl rule__UnaryExpr__Group_2__2 ;
    public final void rule__UnaryExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3795:1: ( rule__UnaryExpr__Group_2__1__Impl rule__UnaryExpr__Group_2__2 )
            // InternalPaplj.g:3796:2: rule__UnaryExpr__Group_2__1__Impl rule__UnaryExpr__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__UnaryExpr__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_2__1"


    // $ANTLR start "rule__UnaryExpr__Group_2__1__Impl"
    // InternalPaplj.g:3803:1: rule__UnaryExpr__Group_2__1__Impl : ( '-' ) ;
    public final void rule__UnaryExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3807:1: ( ( '-' ) )
            // InternalPaplj.g:3808:1: ( '-' )
            {
            // InternalPaplj.g:3808:1: ( '-' )
            // InternalPaplj.g:3809:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getHyphenMinusKeyword_2_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getHyphenMinusKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_2__1__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_2__2"
    // InternalPaplj.g:3818:1: rule__UnaryExpr__Group_2__2 : rule__UnaryExpr__Group_2__2__Impl ;
    public final void rule__UnaryExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3822:1: ( rule__UnaryExpr__Group_2__2__Impl )
            // InternalPaplj.g:3823:2: rule__UnaryExpr__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_2__2"


    // $ANTLR start "rule__UnaryExpr__Group_2__2__Impl"
    // InternalPaplj.g:3829:1: rule__UnaryExpr__Group_2__2__Impl : ( ( rule__UnaryExpr__ExprAssignment_2_2 ) ) ;
    public final void rule__UnaryExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3833:1: ( ( ( rule__UnaryExpr__ExprAssignment_2_2 ) ) )
            // InternalPaplj.g:3834:1: ( ( rule__UnaryExpr__ExprAssignment_2_2 ) )
            {
            // InternalPaplj.g:3834:1: ( ( rule__UnaryExpr__ExprAssignment_2_2 ) )
            // InternalPaplj.g:3835:2: ( rule__UnaryExpr__ExprAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getExprAssignment_2_2()); 
            }
            // InternalPaplj.g:3836:2: ( rule__UnaryExpr__ExprAssignment_2_2 )
            // InternalPaplj.g:3836:3: rule__UnaryExpr__ExprAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__ExprAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getExprAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_2__2__Impl"


    // $ANTLR start "rule__MemberExpr__Group__0"
    // InternalPaplj.g:3845:1: rule__MemberExpr__Group__0 : rule__MemberExpr__Group__0__Impl rule__MemberExpr__Group__1 ;
    public final void rule__MemberExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3849:1: ( rule__MemberExpr__Group__0__Impl rule__MemberExpr__Group__1 )
            // InternalPaplj.g:3850:2: rule__MemberExpr__Group__0__Impl rule__MemberExpr__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MemberExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group__0"


    // $ANTLR start "rule__MemberExpr__Group__0__Impl"
    // InternalPaplj.g:3857:1: rule__MemberExpr__Group__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__MemberExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3861:1: ( ( rulePrimaryExpr ) )
            // InternalPaplj.g:3862:1: ( rulePrimaryExpr )
            {
            // InternalPaplj.g:3862:1: ( rulePrimaryExpr )
            // InternalPaplj.g:3863:2: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getPrimaryExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getPrimaryExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group__0__Impl"


    // $ANTLR start "rule__MemberExpr__Group__1"
    // InternalPaplj.g:3872:1: rule__MemberExpr__Group__1 : rule__MemberExpr__Group__1__Impl ;
    public final void rule__MemberExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3876:1: ( rule__MemberExpr__Group__1__Impl )
            // InternalPaplj.g:3877:2: rule__MemberExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group__1"


    // $ANTLR start "rule__MemberExpr__Group__1__Impl"
    // InternalPaplj.g:3883:1: rule__MemberExpr__Group__1__Impl : ( ( rule__MemberExpr__Group_1__0 )* ) ;
    public final void rule__MemberExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3887:1: ( ( ( rule__MemberExpr__Group_1__0 )* ) )
            // InternalPaplj.g:3888:1: ( ( rule__MemberExpr__Group_1__0 )* )
            {
            // InternalPaplj.g:3888:1: ( ( rule__MemberExpr__Group_1__0 )* )
            // InternalPaplj.g:3889:2: ( rule__MemberExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getGroup_1()); 
            }
            // InternalPaplj.g:3890:2: ( rule__MemberExpr__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPaplj.g:3890:3: rule__MemberExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MemberExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group__1__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1__0"
    // InternalPaplj.g:3899:1: rule__MemberExpr__Group_1__0 : rule__MemberExpr__Group_1__0__Impl ;
    public final void rule__MemberExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3903:1: ( rule__MemberExpr__Group_1__0__Impl )
            // InternalPaplj.g:3904:2: rule__MemberExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1__0"


    // $ANTLR start "rule__MemberExpr__Group_1__0__Impl"
    // InternalPaplj.g:3910:1: rule__MemberExpr__Group_1__0__Impl : ( ( rule__MemberExpr__Group_1_0__0 ) ) ;
    public final void rule__MemberExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3914:1: ( ( ( rule__MemberExpr__Group_1_0__0 ) ) )
            // InternalPaplj.g:3915:1: ( ( rule__MemberExpr__Group_1_0__0 ) )
            {
            // InternalPaplj.g:3915:1: ( ( rule__MemberExpr__Group_1_0__0 ) )
            // InternalPaplj.g:3916:2: ( rule__MemberExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getGroup_1_0()); 
            }
            // InternalPaplj.g:3917:2: ( rule__MemberExpr__Group_1_0__0 )
            // InternalPaplj.g:3917:3: rule__MemberExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1__0__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0__0"
    // InternalPaplj.g:3926:1: rule__MemberExpr__Group_1_0__0 : rule__MemberExpr__Group_1_0__0__Impl rule__MemberExpr__Group_1_0__1 ;
    public final void rule__MemberExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3930:1: ( rule__MemberExpr__Group_1_0__0__Impl rule__MemberExpr__Group_1_0__1 )
            // InternalPaplj.g:3931:2: rule__MemberExpr__Group_1_0__0__Impl rule__MemberExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_9);
            rule__MemberExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0__0"


    // $ANTLR start "rule__MemberExpr__Group_1_0__0__Impl"
    // InternalPaplj.g:3938:1: rule__MemberExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MemberExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3942:1: ( ( () ) )
            // InternalPaplj.g:3943:1: ( () )
            {
            // InternalPaplj.g:3943:1: ( () )
            // InternalPaplj.g:3944:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getMemberRefLeftAction_1_0_0()); 
            }
            // InternalPaplj.g:3945:2: ()
            // InternalPaplj.g:3945:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getMemberRefLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0__1"
    // InternalPaplj.g:3953:1: rule__MemberExpr__Group_1_0__1 : rule__MemberExpr__Group_1_0__1__Impl rule__MemberExpr__Group_1_0__2 ;
    public final void rule__MemberExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3957:1: ( rule__MemberExpr__Group_1_0__1__Impl rule__MemberExpr__Group_1_0__2 )
            // InternalPaplj.g:3958:2: rule__MemberExpr__Group_1_0__1__Impl rule__MemberExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__MemberExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0__1"


    // $ANTLR start "rule__MemberExpr__Group_1_0__1__Impl"
    // InternalPaplj.g:3965:1: rule__MemberExpr__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__MemberExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3969:1: ( ( '.' ) )
            // InternalPaplj.g:3970:1: ( '.' )
            {
            // InternalPaplj.g:3970:1: ( '.' )
            // InternalPaplj.g:3971:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getFullStopKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0__2"
    // InternalPaplj.g:3980:1: rule__MemberExpr__Group_1_0__2 : rule__MemberExpr__Group_1_0__2__Impl rule__MemberExpr__Group_1_0__3 ;
    public final void rule__MemberExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3984:1: ( rule__MemberExpr__Group_1_0__2__Impl rule__MemberExpr__Group_1_0__3 )
            // InternalPaplj.g:3985:2: rule__MemberExpr__Group_1_0__2__Impl rule__MemberExpr__Group_1_0__3
            {
            pushFollow(FOLLOW_15);
            rule__MemberExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0__2"


    // $ANTLR start "rule__MemberExpr__Group_1_0__2__Impl"
    // InternalPaplj.g:3992:1: rule__MemberExpr__Group_1_0__2__Impl : ( ( rule__MemberExpr__MemberAssignment_1_0_2 ) ) ;
    public final void rule__MemberExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:3996:1: ( ( ( rule__MemberExpr__MemberAssignment_1_0_2 ) ) )
            // InternalPaplj.g:3997:1: ( ( rule__MemberExpr__MemberAssignment_1_0_2 ) )
            {
            // InternalPaplj.g:3997:1: ( ( rule__MemberExpr__MemberAssignment_1_0_2 ) )
            // InternalPaplj.g:3998:2: ( rule__MemberExpr__MemberAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getMemberAssignment_1_0_2()); 
            }
            // InternalPaplj.g:3999:2: ( rule__MemberExpr__MemberAssignment_1_0_2 )
            // InternalPaplj.g:3999:3: rule__MemberExpr__MemberAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__MemberAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getMemberAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0__3"
    // InternalPaplj.g:4007:1: rule__MemberExpr__Group_1_0__3 : rule__MemberExpr__Group_1_0__3__Impl ;
    public final void rule__MemberExpr__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4011:1: ( rule__MemberExpr__Group_1_0__3__Impl )
            // InternalPaplj.g:4012:2: rule__MemberExpr__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0__3"


    // $ANTLR start "rule__MemberExpr__Group_1_0__3__Impl"
    // InternalPaplj.g:4018:1: rule__MemberExpr__Group_1_0__3__Impl : ( ( rule__MemberExpr__Group_1_0_3__0 )? ) ;
    public final void rule__MemberExpr__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4022:1: ( ( ( rule__MemberExpr__Group_1_0_3__0 )? ) )
            // InternalPaplj.g:4023:1: ( ( rule__MemberExpr__Group_1_0_3__0 )? )
            {
            // InternalPaplj.g:4023:1: ( ( rule__MemberExpr__Group_1_0_3__0 )? )
            // InternalPaplj.g:4024:2: ( rule__MemberExpr__Group_1_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getGroup_1_0_3()); 
            }
            // InternalPaplj.g:4025:2: ( rule__MemberExpr__Group_1_0_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPaplj.g:4025:3: rule__MemberExpr__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberExpr__Group_1_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getGroup_1_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0__3__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3__0"
    // InternalPaplj.g:4034:1: rule__MemberExpr__Group_1_0_3__0 : rule__MemberExpr__Group_1_0_3__0__Impl rule__MemberExpr__Group_1_0_3__1 ;
    public final void rule__MemberExpr__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4038:1: ( rule__MemberExpr__Group_1_0_3__0__Impl rule__MemberExpr__Group_1_0_3__1 )
            // InternalPaplj.g:4039:2: rule__MemberExpr__Group_1_0_3__0__Impl rule__MemberExpr__Group_1_0_3__1
            {
            pushFollow(FOLLOW_38);
            rule__MemberExpr__Group_1_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3__0"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3__0__Impl"
    // InternalPaplj.g:4046:1: rule__MemberExpr__Group_1_0_3__0__Impl : ( ( rule__MemberExpr__MethodInvocationAssignment_1_0_3_0 ) ) ;
    public final void rule__MemberExpr__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4050:1: ( ( ( rule__MemberExpr__MethodInvocationAssignment_1_0_3_0 ) ) )
            // InternalPaplj.g:4051:1: ( ( rule__MemberExpr__MethodInvocationAssignment_1_0_3_0 ) )
            {
            // InternalPaplj.g:4051:1: ( ( rule__MemberExpr__MethodInvocationAssignment_1_0_3_0 ) )
            // InternalPaplj.g:4052:2: ( rule__MemberExpr__MethodInvocationAssignment_1_0_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getMethodInvocationAssignment_1_0_3_0()); 
            }
            // InternalPaplj.g:4053:2: ( rule__MemberExpr__MethodInvocationAssignment_1_0_3_0 )
            // InternalPaplj.g:4053:3: rule__MemberExpr__MethodInvocationAssignment_1_0_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__MethodInvocationAssignment_1_0_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getMethodInvocationAssignment_1_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3__1"
    // InternalPaplj.g:4061:1: rule__MemberExpr__Group_1_0_3__1 : rule__MemberExpr__Group_1_0_3__1__Impl rule__MemberExpr__Group_1_0_3__2 ;
    public final void rule__MemberExpr__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4065:1: ( rule__MemberExpr__Group_1_0_3__1__Impl rule__MemberExpr__Group_1_0_3__2 )
            // InternalPaplj.g:4066:2: rule__MemberExpr__Group_1_0_3__1__Impl rule__MemberExpr__Group_1_0_3__2
            {
            pushFollow(FOLLOW_38);
            rule__MemberExpr__Group_1_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3__1"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3__1__Impl"
    // InternalPaplj.g:4073:1: rule__MemberExpr__Group_1_0_3__1__Impl : ( ( rule__MemberExpr__Group_1_0_3_1__0 )? ) ;
    public final void rule__MemberExpr__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4077:1: ( ( ( rule__MemberExpr__Group_1_0_3_1__0 )? ) )
            // InternalPaplj.g:4078:1: ( ( rule__MemberExpr__Group_1_0_3_1__0 )? )
            {
            // InternalPaplj.g:4078:1: ( ( rule__MemberExpr__Group_1_0_3_1__0 )? )
            // InternalPaplj.g:4079:2: ( rule__MemberExpr__Group_1_0_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getGroup_1_0_3_1()); 
            }
            // InternalPaplj.g:4080:2: ( rule__MemberExpr__Group_1_0_3_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INT)||LA34_0==11||LA34_0==19||LA34_0==22||LA34_0==32||(LA34_0>=36 && LA34_0<=40)||LA34_0==42||LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPaplj.g:4080:3: rule__MemberExpr__Group_1_0_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberExpr__Group_1_0_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getGroup_1_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3__2"
    // InternalPaplj.g:4088:1: rule__MemberExpr__Group_1_0_3__2 : rule__MemberExpr__Group_1_0_3__2__Impl ;
    public final void rule__MemberExpr__Group_1_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4092:1: ( rule__MemberExpr__Group_1_0_3__2__Impl )
            // InternalPaplj.g:4093:2: rule__MemberExpr__Group_1_0_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3__2"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3__2__Impl"
    // InternalPaplj.g:4099:1: rule__MemberExpr__Group_1_0_3__2__Impl : ( ')' ) ;
    public final void rule__MemberExpr__Group_1_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4103:1: ( ( ')' ) )
            // InternalPaplj.g:4104:1: ( ')' )
            {
            // InternalPaplj.g:4104:1: ( ')' )
            // InternalPaplj.g:4105:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getRightParenthesisKeyword_1_0_3_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getRightParenthesisKeyword_1_0_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3__2__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3_1__0"
    // InternalPaplj.g:4115:1: rule__MemberExpr__Group_1_0_3_1__0 : rule__MemberExpr__Group_1_0_3_1__0__Impl rule__MemberExpr__Group_1_0_3_1__1 ;
    public final void rule__MemberExpr__Group_1_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4119:1: ( rule__MemberExpr__Group_1_0_3_1__0__Impl rule__MemberExpr__Group_1_0_3_1__1 )
            // InternalPaplj.g:4120:2: rule__MemberExpr__Group_1_0_3_1__0__Impl rule__MemberExpr__Group_1_0_3_1__1
            {
            pushFollow(FOLLOW_18);
            rule__MemberExpr__Group_1_0_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3_1__0"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3_1__0__Impl"
    // InternalPaplj.g:4127:1: rule__MemberExpr__Group_1_0_3_1__0__Impl : ( ( rule__MemberExpr__ArgsAssignment_1_0_3_1_0 ) ) ;
    public final void rule__MemberExpr__Group_1_0_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4131:1: ( ( ( rule__MemberExpr__ArgsAssignment_1_0_3_1_0 ) ) )
            // InternalPaplj.g:4132:1: ( ( rule__MemberExpr__ArgsAssignment_1_0_3_1_0 ) )
            {
            // InternalPaplj.g:4132:1: ( ( rule__MemberExpr__ArgsAssignment_1_0_3_1_0 ) )
            // InternalPaplj.g:4133:2: ( rule__MemberExpr__ArgsAssignment_1_0_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getArgsAssignment_1_0_3_1_0()); 
            }
            // InternalPaplj.g:4134:2: ( rule__MemberExpr__ArgsAssignment_1_0_3_1_0 )
            // InternalPaplj.g:4134:3: rule__MemberExpr__ArgsAssignment_1_0_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__ArgsAssignment_1_0_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getArgsAssignment_1_0_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3_1__0__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3_1__1"
    // InternalPaplj.g:4142:1: rule__MemberExpr__Group_1_0_3_1__1 : rule__MemberExpr__Group_1_0_3_1__1__Impl ;
    public final void rule__MemberExpr__Group_1_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4146:1: ( rule__MemberExpr__Group_1_0_3_1__1__Impl )
            // InternalPaplj.g:4147:2: rule__MemberExpr__Group_1_0_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3_1__1"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3_1__1__Impl"
    // InternalPaplj.g:4153:1: rule__MemberExpr__Group_1_0_3_1__1__Impl : ( ( rule__MemberExpr__Group_1_0_3_1_1__0 )* ) ;
    public final void rule__MemberExpr__Group_1_0_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4157:1: ( ( ( rule__MemberExpr__Group_1_0_3_1_1__0 )* ) )
            // InternalPaplj.g:4158:1: ( ( rule__MemberExpr__Group_1_0_3_1_1__0 )* )
            {
            // InternalPaplj.g:4158:1: ( ( rule__MemberExpr__Group_1_0_3_1_1__0 )* )
            // InternalPaplj.g:4159:2: ( rule__MemberExpr__Group_1_0_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getGroup_1_0_3_1_1()); 
            }
            // InternalPaplj.g:4160:2: ( rule__MemberExpr__Group_1_0_3_1_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==24) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPaplj.g:4160:3: rule__MemberExpr__Group_1_0_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__MemberExpr__Group_1_0_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getGroup_1_0_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3_1__1__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3_1_1__0"
    // InternalPaplj.g:4169:1: rule__MemberExpr__Group_1_0_3_1_1__0 : rule__MemberExpr__Group_1_0_3_1_1__0__Impl rule__MemberExpr__Group_1_0_3_1_1__1 ;
    public final void rule__MemberExpr__Group_1_0_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4173:1: ( rule__MemberExpr__Group_1_0_3_1_1__0__Impl rule__MemberExpr__Group_1_0_3_1_1__1 )
            // InternalPaplj.g:4174:2: rule__MemberExpr__Group_1_0_3_1_1__0__Impl rule__MemberExpr__Group_1_0_3_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__MemberExpr__Group_1_0_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3_1_1__0"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3_1_1__0__Impl"
    // InternalPaplj.g:4181:1: rule__MemberExpr__Group_1_0_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__MemberExpr__Group_1_0_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4185:1: ( ( ',' ) )
            // InternalPaplj.g:4186:1: ( ',' )
            {
            // InternalPaplj.g:4186:1: ( ',' )
            // InternalPaplj.g:4187:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getCommaKeyword_1_0_3_1_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getCommaKeyword_1_0_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3_1_1__0__Impl"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3_1_1__1"
    // InternalPaplj.g:4196:1: rule__MemberExpr__Group_1_0_3_1_1__1 : rule__MemberExpr__Group_1_0_3_1_1__1__Impl ;
    public final void rule__MemberExpr__Group_1_0_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4200:1: ( rule__MemberExpr__Group_1_0_3_1_1__1__Impl )
            // InternalPaplj.g:4201:2: rule__MemberExpr__Group_1_0_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__Group_1_0_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3_1_1__1"


    // $ANTLR start "rule__MemberExpr__Group_1_0_3_1_1__1__Impl"
    // InternalPaplj.g:4207:1: rule__MemberExpr__Group_1_0_3_1_1__1__Impl : ( ( rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1 ) ) ;
    public final void rule__MemberExpr__Group_1_0_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4211:1: ( ( ( rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1 ) ) )
            // InternalPaplj.g:4212:1: ( ( rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1 ) )
            {
            // InternalPaplj.g:4212:1: ( ( rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1 ) )
            // InternalPaplj.g:4213:2: ( rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getArgsAssignment_1_0_3_1_1_1()); 
            }
            // InternalPaplj.g:4214:2: ( rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1 )
            // InternalPaplj.g:4214:3: rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getArgsAssignment_1_0_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__Group_1_0_3_1_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_0__0"
    // InternalPaplj.g:4223:1: rule__PrimaryExpr__Group_0__0 : rule__PrimaryExpr__Group_0__0__Impl rule__PrimaryExpr__Group_0__1 ;
    public final void rule__PrimaryExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4227:1: ( rule__PrimaryExpr__Group_0__0__Impl rule__PrimaryExpr__Group_0__1 )
            // InternalPaplj.g:4228:2: rule__PrimaryExpr__Group_0__0__Impl rule__PrimaryExpr__Group_0__1
            {
            pushFollow(FOLLOW_39);
            rule__PrimaryExpr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__0"


    // $ANTLR start "rule__PrimaryExpr__Group_0__0__Impl"
    // InternalPaplj.g:4235:1: rule__PrimaryExpr__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4239:1: ( ( () ) )
            // InternalPaplj.g:4240:1: ( () )
            {
            // InternalPaplj.g:4240:1: ( () )
            // InternalPaplj.g:4241:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getNumAction_0_0()); 
            }
            // InternalPaplj.g:4242:2: ()
            // InternalPaplj.g:4242:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getNumAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_0__1"
    // InternalPaplj.g:4250:1: rule__PrimaryExpr__Group_0__1 : rule__PrimaryExpr__Group_0__1__Impl ;
    public final void rule__PrimaryExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4254:1: ( rule__PrimaryExpr__Group_0__1__Impl )
            // InternalPaplj.g:4255:2: rule__PrimaryExpr__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__1"


    // $ANTLR start "rule__PrimaryExpr__Group_0__1__Impl"
    // InternalPaplj.g:4261:1: rule__PrimaryExpr__Group_0__1__Impl : ( ( rule__PrimaryExpr__ValueAssignment_0_1 ) ) ;
    public final void rule__PrimaryExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4265:1: ( ( ( rule__PrimaryExpr__ValueAssignment_0_1 ) ) )
            // InternalPaplj.g:4266:1: ( ( rule__PrimaryExpr__ValueAssignment_0_1 ) )
            {
            // InternalPaplj.g:4266:1: ( ( rule__PrimaryExpr__ValueAssignment_0_1 ) )
            // InternalPaplj.g:4267:2: ( rule__PrimaryExpr__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getValueAssignment_0_1()); 
            }
            // InternalPaplj.g:4268:2: ( rule__PrimaryExpr__ValueAssignment_0_1 )
            // InternalPaplj.g:4268:3: rule__PrimaryExpr__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1__0"
    // InternalPaplj.g:4277:1: rule__PrimaryExpr__Group_1__0 : rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 ;
    public final void rule__PrimaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4281:1: ( rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 )
            // InternalPaplj.g:4282:2: rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__PrimaryExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__0"


    // $ANTLR start "rule__PrimaryExpr__Group_1__0__Impl"
    // InternalPaplj.g:4289:1: rule__PrimaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4293:1: ( ( () ) )
            // InternalPaplj.g:4294:1: ( () )
            {
            // InternalPaplj.g:4294:1: ( () )
            // InternalPaplj.g:4295:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getBoolAction_1_0()); 
            }
            // InternalPaplj.g:4296:2: ()
            // InternalPaplj.g:4296:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getBoolAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1__1"
    // InternalPaplj.g:4304:1: rule__PrimaryExpr__Group_1__1 : rule__PrimaryExpr__Group_1__1__Impl ;
    public final void rule__PrimaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4308:1: ( rule__PrimaryExpr__Group_1__1__Impl )
            // InternalPaplj.g:4309:2: rule__PrimaryExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__1"


    // $ANTLR start "rule__PrimaryExpr__Group_1__1__Impl"
    // InternalPaplj.g:4315:1: rule__PrimaryExpr__Group_1__1__Impl : ( ( rule__PrimaryExpr__Alternatives_1_1 ) ) ;
    public final void rule__PrimaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4319:1: ( ( ( rule__PrimaryExpr__Alternatives_1_1 ) ) )
            // InternalPaplj.g:4320:1: ( ( rule__PrimaryExpr__Alternatives_1_1 ) )
            {
            // InternalPaplj.g:4320:1: ( ( rule__PrimaryExpr__Alternatives_1_1 ) )
            // InternalPaplj.g:4321:2: ( rule__PrimaryExpr__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getAlternatives_1_1()); 
            }
            // InternalPaplj.g:4322:2: ( rule__PrimaryExpr__Alternatives_1_1 )
            // InternalPaplj.g:4322:3: rule__PrimaryExpr__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_2__0"
    // InternalPaplj.g:4331:1: rule__PrimaryExpr__Group_2__0 : rule__PrimaryExpr__Group_2__0__Impl rule__PrimaryExpr__Group_2__1 ;
    public final void rule__PrimaryExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4335:1: ( rule__PrimaryExpr__Group_2__0__Impl rule__PrimaryExpr__Group_2__1 )
            // InternalPaplj.g:4336:2: rule__PrimaryExpr__Group_2__0__Impl rule__PrimaryExpr__Group_2__1
            {
            pushFollow(FOLLOW_41);
            rule__PrimaryExpr__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__0"


    // $ANTLR start "rule__PrimaryExpr__Group_2__0__Impl"
    // InternalPaplj.g:4343:1: rule__PrimaryExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4347:1: ( ( () ) )
            // InternalPaplj.g:4348:1: ( () )
            {
            // InternalPaplj.g:4348:1: ( () )
            // InternalPaplj.g:4349:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getThisAction_2_0()); 
            }
            // InternalPaplj.g:4350:2: ()
            // InternalPaplj.g:4350:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getThisAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_2__1"
    // InternalPaplj.g:4358:1: rule__PrimaryExpr__Group_2__1 : rule__PrimaryExpr__Group_2__1__Impl ;
    public final void rule__PrimaryExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4362:1: ( rule__PrimaryExpr__Group_2__1__Impl )
            // InternalPaplj.g:4363:2: rule__PrimaryExpr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__1"


    // $ANTLR start "rule__PrimaryExpr__Group_2__1__Impl"
    // InternalPaplj.g:4369:1: rule__PrimaryExpr__Group_2__1__Impl : ( 'this' ) ;
    public final void rule__PrimaryExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4373:1: ( ( 'this' ) )
            // InternalPaplj.g:4374:1: ( 'this' )
            {
            // InternalPaplj.g:4374:1: ( 'this' )
            // InternalPaplj.g:4375:2: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getThisKeyword_2_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getThisKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_3__0"
    // InternalPaplj.g:4385:1: rule__PrimaryExpr__Group_3__0 : rule__PrimaryExpr__Group_3__0__Impl rule__PrimaryExpr__Group_3__1 ;
    public final void rule__PrimaryExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4389:1: ( rule__PrimaryExpr__Group_3__0__Impl rule__PrimaryExpr__Group_3__1 )
            // InternalPaplj.g:4390:2: rule__PrimaryExpr__Group_3__0__Impl rule__PrimaryExpr__Group_3__1
            {
            pushFollow(FOLLOW_42);
            rule__PrimaryExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_3__0"


    // $ANTLR start "rule__PrimaryExpr__Group_3__0__Impl"
    // InternalPaplj.g:4397:1: rule__PrimaryExpr__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4401:1: ( ( () ) )
            // InternalPaplj.g:4402:1: ( () )
            {
            // InternalPaplj.g:4402:1: ( () )
            // InternalPaplj.g:4403:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getNullAction_3_0()); 
            }
            // InternalPaplj.g:4404:2: ()
            // InternalPaplj.g:4404:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getNullAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_3__1"
    // InternalPaplj.g:4412:1: rule__PrimaryExpr__Group_3__1 : rule__PrimaryExpr__Group_3__1__Impl rule__PrimaryExpr__Group_3__2 ;
    public final void rule__PrimaryExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4416:1: ( rule__PrimaryExpr__Group_3__1__Impl rule__PrimaryExpr__Group_3__2 )
            // InternalPaplj.g:4417:2: rule__PrimaryExpr__Group_3__1__Impl rule__PrimaryExpr__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__PrimaryExpr__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_3__1"


    // $ANTLR start "rule__PrimaryExpr__Group_3__1__Impl"
    // InternalPaplj.g:4424:1: rule__PrimaryExpr__Group_3__1__Impl : ( 'null' ) ;
    public final void rule__PrimaryExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4428:1: ( ( 'null' ) )
            // InternalPaplj.g:4429:1: ( 'null' )
            {
            // InternalPaplj.g:4429:1: ( 'null' )
            // InternalPaplj.g:4430:2: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getNullKeyword_3_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getNullKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_3__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_3__2"
    // InternalPaplj.g:4439:1: rule__PrimaryExpr__Group_3__2 : rule__PrimaryExpr__Group_3__2__Impl ;
    public final void rule__PrimaryExpr__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4443:1: ( rule__PrimaryExpr__Group_3__2__Impl )
            // InternalPaplj.g:4444:2: rule__PrimaryExpr__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_3__2"


    // $ANTLR start "rule__PrimaryExpr__Group_3__2__Impl"
    // InternalPaplj.g:4450:1: rule__PrimaryExpr__Group_3__2__Impl : ( ( rule__PrimaryExpr__TypeAssignment_3_2 )? ) ;
    public final void rule__PrimaryExpr__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4454:1: ( ( ( rule__PrimaryExpr__TypeAssignment_3_2 )? ) )
            // InternalPaplj.g:4455:1: ( ( rule__PrimaryExpr__TypeAssignment_3_2 )? )
            {
            // InternalPaplj.g:4455:1: ( ( rule__PrimaryExpr__TypeAssignment_3_2 )? )
            // InternalPaplj.g:4456:2: ( rule__PrimaryExpr__TypeAssignment_3_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getTypeAssignment_3_2()); 
            }
            // InternalPaplj.g:4457:2: ( rule__PrimaryExpr__TypeAssignment_3_2 )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalPaplj.g:4457:3: rule__PrimaryExpr__TypeAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__TypeAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getTypeAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_3__2__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_4__0"
    // InternalPaplj.g:4466:1: rule__PrimaryExpr__Group_4__0 : rule__PrimaryExpr__Group_4__0__Impl rule__PrimaryExpr__Group_4__1 ;
    public final void rule__PrimaryExpr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4470:1: ( rule__PrimaryExpr__Group_4__0__Impl rule__PrimaryExpr__Group_4__1 )
            // InternalPaplj.g:4471:2: rule__PrimaryExpr__Group_4__0__Impl rule__PrimaryExpr__Group_4__1
            {
            pushFollow(FOLLOW_43);
            rule__PrimaryExpr__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_4__0"


    // $ANTLR start "rule__PrimaryExpr__Group_4__0__Impl"
    // InternalPaplj.g:4478:1: rule__PrimaryExpr__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4482:1: ( ( () ) )
            // InternalPaplj.g:4483:1: ( () )
            {
            // InternalPaplj.g:4483:1: ( () )
            // InternalPaplj.g:4484:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getNewAction_4_0()); 
            }
            // InternalPaplj.g:4485:2: ()
            // InternalPaplj.g:4485:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getNewAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_4__1"
    // InternalPaplj.g:4493:1: rule__PrimaryExpr__Group_4__1 : rule__PrimaryExpr__Group_4__1__Impl rule__PrimaryExpr__Group_4__2 ;
    public final void rule__PrimaryExpr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4497:1: ( rule__PrimaryExpr__Group_4__1__Impl rule__PrimaryExpr__Group_4__2 )
            // InternalPaplj.g:4498:2: rule__PrimaryExpr__Group_4__1__Impl rule__PrimaryExpr__Group_4__2
            {
            pushFollow(FOLLOW_6);
            rule__PrimaryExpr__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_4__1"


    // $ANTLR start "rule__PrimaryExpr__Group_4__1__Impl"
    // InternalPaplj.g:4505:1: rule__PrimaryExpr__Group_4__1__Impl : ( 'new' ) ;
    public final void rule__PrimaryExpr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4509:1: ( ( 'new' ) )
            // InternalPaplj.g:4510:1: ( 'new' )
            {
            // InternalPaplj.g:4510:1: ( 'new' )
            // InternalPaplj.g:4511:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getNewKeyword_4_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getNewKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_4__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_4__2"
    // InternalPaplj.g:4520:1: rule__PrimaryExpr__Group_4__2 : rule__PrimaryExpr__Group_4__2__Impl rule__PrimaryExpr__Group_4__3 ;
    public final void rule__PrimaryExpr__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4524:1: ( rule__PrimaryExpr__Group_4__2__Impl rule__PrimaryExpr__Group_4__3 )
            // InternalPaplj.g:4525:2: rule__PrimaryExpr__Group_4__2__Impl rule__PrimaryExpr__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__PrimaryExpr__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_4__2"


    // $ANTLR start "rule__PrimaryExpr__Group_4__2__Impl"
    // InternalPaplj.g:4532:1: rule__PrimaryExpr__Group_4__2__Impl : ( ( rule__PrimaryExpr__TypeAssignment_4_2 ) ) ;
    public final void rule__PrimaryExpr__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4536:1: ( ( ( rule__PrimaryExpr__TypeAssignment_4_2 ) ) )
            // InternalPaplj.g:4537:1: ( ( rule__PrimaryExpr__TypeAssignment_4_2 ) )
            {
            // InternalPaplj.g:4537:1: ( ( rule__PrimaryExpr__TypeAssignment_4_2 ) )
            // InternalPaplj.g:4538:2: ( rule__PrimaryExpr__TypeAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getTypeAssignment_4_2()); 
            }
            // InternalPaplj.g:4539:2: ( rule__PrimaryExpr__TypeAssignment_4_2 )
            // InternalPaplj.g:4539:3: rule__PrimaryExpr__TypeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__TypeAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getTypeAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_4__2__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_4__3"
    // InternalPaplj.g:4547:1: rule__PrimaryExpr__Group_4__3 : rule__PrimaryExpr__Group_4__3__Impl rule__PrimaryExpr__Group_4__4 ;
    public final void rule__PrimaryExpr__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4551:1: ( rule__PrimaryExpr__Group_4__3__Impl rule__PrimaryExpr__Group_4__4 )
            // InternalPaplj.g:4552:2: rule__PrimaryExpr__Group_4__3__Impl rule__PrimaryExpr__Group_4__4
            {
            pushFollow(FOLLOW_44);
            rule__PrimaryExpr__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_4__3"


    // $ANTLR start "rule__PrimaryExpr__Group_4__3__Impl"
    // InternalPaplj.g:4559:1: rule__PrimaryExpr__Group_4__3__Impl : ( '(' ) ;
    public final void rule__PrimaryExpr__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4563:1: ( ( '(' ) )
            // InternalPaplj.g:4564:1: ( '(' )
            {
            // InternalPaplj.g:4564:1: ( '(' )
            // InternalPaplj.g:4565:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_4_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_4__3__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_4__4"
    // InternalPaplj.g:4574:1: rule__PrimaryExpr__Group_4__4 : rule__PrimaryExpr__Group_4__4__Impl ;
    public final void rule__PrimaryExpr__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4578:1: ( rule__PrimaryExpr__Group_4__4__Impl )
            // InternalPaplj.g:4579:2: rule__PrimaryExpr__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_4__4"


    // $ANTLR start "rule__PrimaryExpr__Group_4__4__Impl"
    // InternalPaplj.g:4585:1: rule__PrimaryExpr__Group_4__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpr__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4589:1: ( ( ')' ) )
            // InternalPaplj.g:4590:1: ( ')' )
            {
            // InternalPaplj.g:4590:1: ( ')' )
            // InternalPaplj.g:4591:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_4_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_4__4__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_5__0"
    // InternalPaplj.g:4601:1: rule__PrimaryExpr__Group_5__0 : rule__PrimaryExpr__Group_5__0__Impl rule__PrimaryExpr__Group_5__1 ;
    public final void rule__PrimaryExpr__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4605:1: ( rule__PrimaryExpr__Group_5__0__Impl rule__PrimaryExpr__Group_5__1 )
            // InternalPaplj.g:4606:2: rule__PrimaryExpr__Group_5__0__Impl rule__PrimaryExpr__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__PrimaryExpr__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5__0"


    // $ANTLR start "rule__PrimaryExpr__Group_5__0__Impl"
    // InternalPaplj.g:4613:1: rule__PrimaryExpr__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4617:1: ( ( () ) )
            // InternalPaplj.g:4618:1: ( () )
            {
            // InternalPaplj.g:4618:1: ( () )
            // InternalPaplj.g:4619:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getVarAction_5_0()); 
            }
            // InternalPaplj.g:4620:2: ()
            // InternalPaplj.g:4620:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getVarAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_5__1"
    // InternalPaplj.g:4628:1: rule__PrimaryExpr__Group_5__1 : rule__PrimaryExpr__Group_5__1__Impl rule__PrimaryExpr__Group_5__2 ;
    public final void rule__PrimaryExpr__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4632:1: ( rule__PrimaryExpr__Group_5__1__Impl rule__PrimaryExpr__Group_5__2 )
            // InternalPaplj.g:4633:2: rule__PrimaryExpr__Group_5__1__Impl rule__PrimaryExpr__Group_5__2
            {
            pushFollow(FOLLOW_15);
            rule__PrimaryExpr__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5__1"


    // $ANTLR start "rule__PrimaryExpr__Group_5__1__Impl"
    // InternalPaplj.g:4640:1: rule__PrimaryExpr__Group_5__1__Impl : ( ( rule__PrimaryExpr__MemberAssignment_5_1 ) ) ;
    public final void rule__PrimaryExpr__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4644:1: ( ( ( rule__PrimaryExpr__MemberAssignment_5_1 ) ) )
            // InternalPaplj.g:4645:1: ( ( rule__PrimaryExpr__MemberAssignment_5_1 ) )
            {
            // InternalPaplj.g:4645:1: ( ( rule__PrimaryExpr__MemberAssignment_5_1 ) )
            // InternalPaplj.g:4646:2: ( rule__PrimaryExpr__MemberAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getMemberAssignment_5_1()); 
            }
            // InternalPaplj.g:4647:2: ( rule__PrimaryExpr__MemberAssignment_5_1 )
            // InternalPaplj.g:4647:3: rule__PrimaryExpr__MemberAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__MemberAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getMemberAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_5__2"
    // InternalPaplj.g:4655:1: rule__PrimaryExpr__Group_5__2 : rule__PrimaryExpr__Group_5__2__Impl ;
    public final void rule__PrimaryExpr__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4659:1: ( rule__PrimaryExpr__Group_5__2__Impl )
            // InternalPaplj.g:4660:2: rule__PrimaryExpr__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5__2"


    // $ANTLR start "rule__PrimaryExpr__Group_5__2__Impl"
    // InternalPaplj.g:4666:1: rule__PrimaryExpr__Group_5__2__Impl : ( ( rule__PrimaryExpr__Group_5_2__0 )? ) ;
    public final void rule__PrimaryExpr__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4670:1: ( ( ( rule__PrimaryExpr__Group_5_2__0 )? ) )
            // InternalPaplj.g:4671:1: ( ( rule__PrimaryExpr__Group_5_2__0 )? )
            {
            // InternalPaplj.g:4671:1: ( ( rule__PrimaryExpr__Group_5_2__0 )? )
            // InternalPaplj.g:4672:2: ( rule__PrimaryExpr__Group_5_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup_5_2()); 
            }
            // InternalPaplj.g:4673:2: ( rule__PrimaryExpr__Group_5_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPaplj.g:4673:3: rule__PrimaryExpr__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_5_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getGroup_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5__2__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2__0"
    // InternalPaplj.g:4682:1: rule__PrimaryExpr__Group_5_2__0 : rule__PrimaryExpr__Group_5_2__0__Impl rule__PrimaryExpr__Group_5_2__1 ;
    public final void rule__PrimaryExpr__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4686:1: ( rule__PrimaryExpr__Group_5_2__0__Impl rule__PrimaryExpr__Group_5_2__1 )
            // InternalPaplj.g:4687:2: rule__PrimaryExpr__Group_5_2__0__Impl rule__PrimaryExpr__Group_5_2__1
            {
            pushFollow(FOLLOW_38);
            rule__PrimaryExpr__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2__0"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2__0__Impl"
    // InternalPaplj.g:4694:1: rule__PrimaryExpr__Group_5_2__0__Impl : ( ( rule__PrimaryExpr__MethodInvocationAssignment_5_2_0 ) ) ;
    public final void rule__PrimaryExpr__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4698:1: ( ( ( rule__PrimaryExpr__MethodInvocationAssignment_5_2_0 ) ) )
            // InternalPaplj.g:4699:1: ( ( rule__PrimaryExpr__MethodInvocationAssignment_5_2_0 ) )
            {
            // InternalPaplj.g:4699:1: ( ( rule__PrimaryExpr__MethodInvocationAssignment_5_2_0 ) )
            // InternalPaplj.g:4700:2: ( rule__PrimaryExpr__MethodInvocationAssignment_5_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getMethodInvocationAssignment_5_2_0()); 
            }
            // InternalPaplj.g:4701:2: ( rule__PrimaryExpr__MethodInvocationAssignment_5_2_0 )
            // InternalPaplj.g:4701:3: rule__PrimaryExpr__MethodInvocationAssignment_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__MethodInvocationAssignment_5_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getMethodInvocationAssignment_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2__1"
    // InternalPaplj.g:4709:1: rule__PrimaryExpr__Group_5_2__1 : rule__PrimaryExpr__Group_5_2__1__Impl rule__PrimaryExpr__Group_5_2__2 ;
    public final void rule__PrimaryExpr__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4713:1: ( rule__PrimaryExpr__Group_5_2__1__Impl rule__PrimaryExpr__Group_5_2__2 )
            // InternalPaplj.g:4714:2: rule__PrimaryExpr__Group_5_2__1__Impl rule__PrimaryExpr__Group_5_2__2
            {
            pushFollow(FOLLOW_38);
            rule__PrimaryExpr__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_5_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2__1"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2__1__Impl"
    // InternalPaplj.g:4721:1: rule__PrimaryExpr__Group_5_2__1__Impl : ( ( rule__PrimaryExpr__Group_5_2_1__0 )? ) ;
    public final void rule__PrimaryExpr__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4725:1: ( ( ( rule__PrimaryExpr__Group_5_2_1__0 )? ) )
            // InternalPaplj.g:4726:1: ( ( rule__PrimaryExpr__Group_5_2_1__0 )? )
            {
            // InternalPaplj.g:4726:1: ( ( rule__PrimaryExpr__Group_5_2_1__0 )? )
            // InternalPaplj.g:4727:2: ( rule__PrimaryExpr__Group_5_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup_5_2_1()); 
            }
            // InternalPaplj.g:4728:2: ( rule__PrimaryExpr__Group_5_2_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_INT)||LA38_0==11||LA38_0==19||LA38_0==22||LA38_0==32||(LA38_0>=36 && LA38_0<=40)||LA38_0==42||LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPaplj.g:4728:3: rule__PrimaryExpr__Group_5_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_5_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getGroup_5_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2__2"
    // InternalPaplj.g:4736:1: rule__PrimaryExpr__Group_5_2__2 : rule__PrimaryExpr__Group_5_2__2__Impl ;
    public final void rule__PrimaryExpr__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4740:1: ( rule__PrimaryExpr__Group_5_2__2__Impl )
            // InternalPaplj.g:4741:2: rule__PrimaryExpr__Group_5_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_5_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2__2"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2__2__Impl"
    // InternalPaplj.g:4747:1: rule__PrimaryExpr__Group_5_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpr__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4751:1: ( ( ')' ) )
            // InternalPaplj.g:4752:1: ( ')' )
            {
            // InternalPaplj.g:4752:1: ( ')' )
            // InternalPaplj.g:4753:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_5_2_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_5_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2_1__0"
    // InternalPaplj.g:4763:1: rule__PrimaryExpr__Group_5_2_1__0 : rule__PrimaryExpr__Group_5_2_1__0__Impl rule__PrimaryExpr__Group_5_2_1__1 ;
    public final void rule__PrimaryExpr__Group_5_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4767:1: ( rule__PrimaryExpr__Group_5_2_1__0__Impl rule__PrimaryExpr__Group_5_2_1__1 )
            // InternalPaplj.g:4768:2: rule__PrimaryExpr__Group_5_2_1__0__Impl rule__PrimaryExpr__Group_5_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__PrimaryExpr__Group_5_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_5_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2_1__0"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2_1__0__Impl"
    // InternalPaplj.g:4775:1: rule__PrimaryExpr__Group_5_2_1__0__Impl : ( ( rule__PrimaryExpr__ArgsAssignment_5_2_1_0 ) ) ;
    public final void rule__PrimaryExpr__Group_5_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4779:1: ( ( ( rule__PrimaryExpr__ArgsAssignment_5_2_1_0 ) ) )
            // InternalPaplj.g:4780:1: ( ( rule__PrimaryExpr__ArgsAssignment_5_2_1_0 ) )
            {
            // InternalPaplj.g:4780:1: ( ( rule__PrimaryExpr__ArgsAssignment_5_2_1_0 ) )
            // InternalPaplj.g:4781:2: ( rule__PrimaryExpr__ArgsAssignment_5_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getArgsAssignment_5_2_1_0()); 
            }
            // InternalPaplj.g:4782:2: ( rule__PrimaryExpr__ArgsAssignment_5_2_1_0 )
            // InternalPaplj.g:4782:3: rule__PrimaryExpr__ArgsAssignment_5_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__ArgsAssignment_5_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getArgsAssignment_5_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2_1__1"
    // InternalPaplj.g:4790:1: rule__PrimaryExpr__Group_5_2_1__1 : rule__PrimaryExpr__Group_5_2_1__1__Impl ;
    public final void rule__PrimaryExpr__Group_5_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4794:1: ( rule__PrimaryExpr__Group_5_2_1__1__Impl )
            // InternalPaplj.g:4795:2: rule__PrimaryExpr__Group_5_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_5_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2_1__1"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2_1__1__Impl"
    // InternalPaplj.g:4801:1: rule__PrimaryExpr__Group_5_2_1__1__Impl : ( ( rule__PrimaryExpr__Group_5_2_1_1__0 )* ) ;
    public final void rule__PrimaryExpr__Group_5_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4805:1: ( ( ( rule__PrimaryExpr__Group_5_2_1_1__0 )* ) )
            // InternalPaplj.g:4806:1: ( ( rule__PrimaryExpr__Group_5_2_1_1__0 )* )
            {
            // InternalPaplj.g:4806:1: ( ( rule__PrimaryExpr__Group_5_2_1_1__0 )* )
            // InternalPaplj.g:4807:2: ( rule__PrimaryExpr__Group_5_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup_5_2_1_1()); 
            }
            // InternalPaplj.g:4808:2: ( rule__PrimaryExpr__Group_5_2_1_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==24) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPaplj.g:4808:3: rule__PrimaryExpr__Group_5_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__PrimaryExpr__Group_5_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getGroup_5_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2_1_1__0"
    // InternalPaplj.g:4817:1: rule__PrimaryExpr__Group_5_2_1_1__0 : rule__PrimaryExpr__Group_5_2_1_1__0__Impl rule__PrimaryExpr__Group_5_2_1_1__1 ;
    public final void rule__PrimaryExpr__Group_5_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4821:1: ( rule__PrimaryExpr__Group_5_2_1_1__0__Impl rule__PrimaryExpr__Group_5_2_1_1__1 )
            // InternalPaplj.g:4822:2: rule__PrimaryExpr__Group_5_2_1_1__0__Impl rule__PrimaryExpr__Group_5_2_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryExpr__Group_5_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_5_2_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2_1_1__0"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2_1_1__0__Impl"
    // InternalPaplj.g:4829:1: rule__PrimaryExpr__Group_5_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__PrimaryExpr__Group_5_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4833:1: ( ( ',' ) )
            // InternalPaplj.g:4834:1: ( ',' )
            {
            // InternalPaplj.g:4834:1: ( ',' )
            // InternalPaplj.g:4835:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getCommaKeyword_5_2_1_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getCommaKeyword_5_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2_1_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2_1_1__1"
    // InternalPaplj.g:4844:1: rule__PrimaryExpr__Group_5_2_1_1__1 : rule__PrimaryExpr__Group_5_2_1_1__1__Impl ;
    public final void rule__PrimaryExpr__Group_5_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4848:1: ( rule__PrimaryExpr__Group_5_2_1_1__1__Impl )
            // InternalPaplj.g:4849:2: rule__PrimaryExpr__Group_5_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_5_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2_1_1__1"


    // $ANTLR start "rule__PrimaryExpr__Group_5_2_1_1__1__Impl"
    // InternalPaplj.g:4855:1: rule__PrimaryExpr__Group_5_2_1_1__1__Impl : ( ( rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1 ) ) ;
    public final void rule__PrimaryExpr__Group_5_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4859:1: ( ( ( rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1 ) ) )
            // InternalPaplj.g:4860:1: ( ( rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1 ) )
            {
            // InternalPaplj.g:4860:1: ( ( rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1 ) )
            // InternalPaplj.g:4861:2: ( rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getArgsAssignment_5_2_1_1_1()); 
            }
            // InternalPaplj.g:4862:2: ( rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1 )
            // InternalPaplj.g:4862:3: rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getArgsAssignment_5_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_5_2_1_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_7__0"
    // InternalPaplj.g:4871:1: rule__PrimaryExpr__Group_7__0 : rule__PrimaryExpr__Group_7__0__Impl rule__PrimaryExpr__Group_7__1 ;
    public final void rule__PrimaryExpr__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4875:1: ( rule__PrimaryExpr__Group_7__0__Impl rule__PrimaryExpr__Group_7__1 )
            // InternalPaplj.g:4876:2: rule__PrimaryExpr__Group_7__0__Impl rule__PrimaryExpr__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryExpr__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_7__0"


    // $ANTLR start "rule__PrimaryExpr__Group_7__0__Impl"
    // InternalPaplj.g:4883:1: rule__PrimaryExpr__Group_7__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpr__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4887:1: ( ( '(' ) )
            // InternalPaplj.g:4888:1: ( '(' )
            {
            // InternalPaplj.g:4888:1: ( '(' )
            // InternalPaplj.g:4889:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_7_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_7__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_7__1"
    // InternalPaplj.g:4898:1: rule__PrimaryExpr__Group_7__1 : rule__PrimaryExpr__Group_7__1__Impl rule__PrimaryExpr__Group_7__2 ;
    public final void rule__PrimaryExpr__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4902:1: ( rule__PrimaryExpr__Group_7__1__Impl rule__PrimaryExpr__Group_7__2 )
            // InternalPaplj.g:4903:2: rule__PrimaryExpr__Group_7__1__Impl rule__PrimaryExpr__Group_7__2
            {
            pushFollow(FOLLOW_44);
            rule__PrimaryExpr__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_7__1"


    // $ANTLR start "rule__PrimaryExpr__Group_7__1__Impl"
    // InternalPaplj.g:4910:1: rule__PrimaryExpr__Group_7__1__Impl : ( ruleExpr ) ;
    public final void rule__PrimaryExpr__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4914:1: ( ( ruleExpr ) )
            // InternalPaplj.g:4915:1: ( ruleExpr )
            {
            // InternalPaplj.g:4915:1: ( ruleExpr )
            // InternalPaplj.g:4916:2: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getExprParserRuleCall_7_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getExprParserRuleCall_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_7__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_7__2"
    // InternalPaplj.g:4925:1: rule__PrimaryExpr__Group_7__2 : rule__PrimaryExpr__Group_7__2__Impl ;
    public final void rule__PrimaryExpr__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4929:1: ( rule__PrimaryExpr__Group_7__2__Impl )
            // InternalPaplj.g:4930:2: rule__PrimaryExpr__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_7__2"


    // $ANTLR start "rule__PrimaryExpr__Group_7__2__Impl"
    // InternalPaplj.g:4936:1: rule__PrimaryExpr__Group_7__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpr__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4940:1: ( ( ')' ) )
            // InternalPaplj.g:4941:1: ( ')' )
            {
            // InternalPaplj.g:4941:1: ( ')' )
            // InternalPaplj.g:4942:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_7_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_7__2__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalPaplj.g:4952:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4956:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalPaplj.g:4957:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalPaplj.g:4964:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4968:1: ( ( 'if' ) )
            // InternalPaplj.g:4969:1: ( 'if' )
            {
            // InternalPaplj.g:4969:1: ( 'if' )
            // InternalPaplj.g:4970:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalPaplj.g:4979:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4983:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalPaplj.g:4984:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalPaplj.g:4991:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:4995:1: ( ( '(' ) )
            // InternalPaplj.g:4996:1: ( '(' )
            {
            // InternalPaplj.g:4996:1: ( '(' )
            // InternalPaplj.g:4997:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalPaplj.g:5006:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5010:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalPaplj.g:5011:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalPaplj.g:5018:1: rule__If__Group__2__Impl : ( ( rule__If__ConditionAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5022:1: ( ( ( rule__If__ConditionAssignment_2 ) ) )
            // InternalPaplj.g:5023:1: ( ( rule__If__ConditionAssignment_2 ) )
            {
            // InternalPaplj.g:5023:1: ( ( rule__If__ConditionAssignment_2 ) )
            // InternalPaplj.g:5024:2: ( rule__If__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionAssignment_2()); 
            }
            // InternalPaplj.g:5025:2: ( rule__If__ConditionAssignment_2 )
            // InternalPaplj.g:5025:3: rule__If__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalPaplj.g:5033:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5037:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalPaplj.g:5038:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalPaplj.g:5045:1: rule__If__Group__3__Impl : ( ')' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5049:1: ( ( ')' ) )
            // InternalPaplj.g:5050:1: ( ')' )
            {
            // InternalPaplj.g:5050:1: ( ')' )
            // InternalPaplj.g:5051:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalPaplj.g:5060:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5064:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalPaplj.g:5065:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalPaplj.g:5072:1: rule__If__Group__4__Impl : ( ( rule__If__OnTrueAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5076:1: ( ( ( rule__If__OnTrueAssignment_4 ) ) )
            // InternalPaplj.g:5077:1: ( ( rule__If__OnTrueAssignment_4 ) )
            {
            // InternalPaplj.g:5077:1: ( ( rule__If__OnTrueAssignment_4 ) )
            // InternalPaplj.g:5078:2: ( rule__If__OnTrueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getOnTrueAssignment_4()); 
            }
            // InternalPaplj.g:5079:2: ( rule__If__OnTrueAssignment_4 )
            // InternalPaplj.g:5079:3: rule__If__OnTrueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__If__OnTrueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getOnTrueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // InternalPaplj.g:5087:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5091:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalPaplj.g:5092:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__If__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // InternalPaplj.g:5099:1: rule__If__Group__5__Impl : ( 'else' ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5103:1: ( ( 'else' ) )
            // InternalPaplj.g:5104:1: ( 'else' )
            {
            // InternalPaplj.g:5104:1: ( 'else' )
            // InternalPaplj.g:5105:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_5()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // InternalPaplj.g:5114:1: rule__If__Group__6 : rule__If__Group__6__Impl ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5118:1: ( rule__If__Group__6__Impl )
            // InternalPaplj.g:5119:2: rule__If__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // InternalPaplj.g:5125:1: rule__If__Group__6__Impl : ( ( rule__If__OnFalseAssignment_6 ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5129:1: ( ( ( rule__If__OnFalseAssignment_6 ) ) )
            // InternalPaplj.g:5130:1: ( ( rule__If__OnFalseAssignment_6 ) )
            {
            // InternalPaplj.g:5130:1: ( ( rule__If__OnFalseAssignment_6 ) )
            // InternalPaplj.g:5131:2: ( rule__If__OnFalseAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getOnFalseAssignment_6()); 
            }
            // InternalPaplj.g:5132:2: ( rule__If__OnFalseAssignment_6 )
            // InternalPaplj.g:5132:3: rule__If__OnFalseAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__If__OnFalseAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getOnFalseAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__Let__Group__0"
    // InternalPaplj.g:5141:1: rule__Let__Group__0 : rule__Let__Group__0__Impl rule__Let__Group__1 ;
    public final void rule__Let__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5145:1: ( rule__Let__Group__0__Impl rule__Let__Group__1 )
            // InternalPaplj.g:5146:2: rule__Let__Group__0__Impl rule__Let__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Let__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Let__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__0"


    // $ANTLR start "rule__Let__Group__0__Impl"
    // InternalPaplj.g:5153:1: rule__Let__Group__0__Impl : ( 'let' ) ;
    public final void rule__Let__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5157:1: ( ( 'let' ) )
            // InternalPaplj.g:5158:1: ( 'let' )
            {
            // InternalPaplj.g:5158:1: ( 'let' )
            // InternalPaplj.g:5159:2: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetAccess().getLetKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetAccess().getLetKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__0__Impl"


    // $ANTLR start "rule__Let__Group__1"
    // InternalPaplj.g:5168:1: rule__Let__Group__1 : rule__Let__Group__1__Impl rule__Let__Group__2 ;
    public final void rule__Let__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5172:1: ( rule__Let__Group__1__Impl rule__Let__Group__2 )
            // InternalPaplj.g:5173:2: rule__Let__Group__1__Impl rule__Let__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Let__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Let__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__1"


    // $ANTLR start "rule__Let__Group__1__Impl"
    // InternalPaplj.g:5180:1: rule__Let__Group__1__Impl : ( ( rule__Let__BindingsAssignment_1 )* ) ;
    public final void rule__Let__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5184:1: ( ( ( rule__Let__BindingsAssignment_1 )* ) )
            // InternalPaplj.g:5185:1: ( ( rule__Let__BindingsAssignment_1 )* )
            {
            // InternalPaplj.g:5185:1: ( ( rule__Let__BindingsAssignment_1 )* )
            // InternalPaplj.g:5186:2: ( rule__Let__BindingsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetAccess().getBindingsAssignment_1()); 
            }
            // InternalPaplj.g:5187:2: ( rule__Let__BindingsAssignment_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPaplj.g:5187:3: rule__Let__BindingsAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Let__BindingsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetAccess().getBindingsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__1__Impl"


    // $ANTLR start "rule__Let__Group__2"
    // InternalPaplj.g:5195:1: rule__Let__Group__2 : rule__Let__Group__2__Impl rule__Let__Group__3 ;
    public final void rule__Let__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5199:1: ( rule__Let__Group__2__Impl rule__Let__Group__3 )
            // InternalPaplj.g:5200:2: rule__Let__Group__2__Impl rule__Let__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Let__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Let__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__2"


    // $ANTLR start "rule__Let__Group__2__Impl"
    // InternalPaplj.g:5207:1: rule__Let__Group__2__Impl : ( 'in' ) ;
    public final void rule__Let__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5211:1: ( ( 'in' ) )
            // InternalPaplj.g:5212:1: ( 'in' )
            {
            // InternalPaplj.g:5212:1: ( 'in' )
            // InternalPaplj.g:5213:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetAccess().getInKeyword_2()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetAccess().getInKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__2__Impl"


    // $ANTLR start "rule__Let__Group__3"
    // InternalPaplj.g:5222:1: rule__Let__Group__3 : rule__Let__Group__3__Impl ;
    public final void rule__Let__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5226:1: ( rule__Let__Group__3__Impl )
            // InternalPaplj.g:5227:2: rule__Let__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__3"


    // $ANTLR start "rule__Let__Group__3__Impl"
    // InternalPaplj.g:5233:1: rule__Let__Group__3__Impl : ( ( rule__Let__ExprAssignment_3 ) ) ;
    public final void rule__Let__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5237:1: ( ( ( rule__Let__ExprAssignment_3 ) ) )
            // InternalPaplj.g:5238:1: ( ( rule__Let__ExprAssignment_3 ) )
            {
            // InternalPaplj.g:5238:1: ( ( rule__Let__ExprAssignment_3 ) )
            // InternalPaplj.g:5239:2: ( rule__Let__ExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetAccess().getExprAssignment_3()); 
            }
            // InternalPaplj.g:5240:2: ( rule__Let__ExprAssignment_3 )
            // InternalPaplj.g:5240:3: rule__Let__ExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Let__ExprAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetAccess().getExprAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__3__Impl"


    // $ANTLR start "rule__Program__NameAssignment_0_1"
    // InternalPaplj.g:5249:1: rule__Program__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__Program__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5253:1: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:5254:2: ( ruleQualifiedName )
            {
            // InternalPaplj.g:5254:2: ( ruleQualifiedName )
            // InternalPaplj.g:5255:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_0_1"


    // $ANTLR start "rule__Program__ImportsAssignment_1"
    // InternalPaplj.g:5264:1: rule__Program__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Program__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5268:1: ( ( ruleImport ) )
            // InternalPaplj.g:5269:2: ( ruleImport )
            {
            // InternalPaplj.g:5269:2: ( ruleImport )
            // InternalPaplj.g:5270:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ImportsAssignment_1"


    // $ANTLR start "rule__Program__ClassesAssignment_2"
    // InternalPaplj.g:5279:1: rule__Program__ClassesAssignment_2 : ( ruleType ) ;
    public final void rule__Program__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5283:1: ( ( ruleType ) )
            // InternalPaplj.g:5284:2: ( ruleType )
            {
            // InternalPaplj.g:5284:2: ( ruleType )
            // InternalPaplj.g:5285:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ClassesAssignment_2"


    // $ANTLR start "rule__Program__ExprAssignment_3_1"
    // InternalPaplj.g:5294:1: rule__Program__ExprAssignment_3_1 : ( ruleExpr ) ;
    public final void rule__Program__ExprAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5298:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5299:2: ( ruleExpr )
            {
            // InternalPaplj.g:5299:2: ( ruleExpr )
            // InternalPaplj.g:5300:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExprExprParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getExprExprParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ExprAssignment_3_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalPaplj.g:5309:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5313:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalPaplj.g:5314:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalPaplj.g:5314:2: ( ruleQualifiedNameWithWildcard )
            // InternalPaplj.g:5315:3: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalPaplj.g:5324:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5328:1: ( ( RULE_ID ) )
            // InternalPaplj.g:5329:2: ( RULE_ID )
            {
            // InternalPaplj.g:5329:2: ( RULE_ID )
            // InternalPaplj.g:5330:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__Type__SuperTypeAssignment_2_1"
    // InternalPaplj.g:5339:1: rule__Type__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Type__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5343:1: ( ( ( ruleQualifiedName ) ) )
            // InternalPaplj.g:5344:2: ( ( ruleQualifiedName ) )
            {
            // InternalPaplj.g:5344:2: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:5345:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSuperTypeTypeCrossReference_2_1_0()); 
            }
            // InternalPaplj.g:5346:3: ( ruleQualifiedName )
            // InternalPaplj.g:5347:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSuperTypeTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSuperTypeTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSuperTypeTypeCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Type__MembersAssignment_4"
    // InternalPaplj.g:5358:1: rule__Type__MembersAssignment_4 : ( ruleMember ) ;
    public final void rule__Type__MembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5362:1: ( ( ruleMember ) )
            // InternalPaplj.g:5363:2: ( ruleMember )
            {
            // InternalPaplj.g:5363:2: ( ruleMember )
            // InternalPaplj.g:5364:3: ruleMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getMembersMemberParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getMembersMemberParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__MembersAssignment_4"


    // $ANTLR start "rule__Field__TypeAssignment_0"
    // InternalPaplj.g:5373:1: rule__Field__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Field__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5377:1: ( ( ( ruleQualifiedName ) ) )
            // InternalPaplj.g:5378:2: ( ( ruleQualifiedName ) )
            {
            // InternalPaplj.g:5378:2: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:5379:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeTypeCrossReference_0_0()); 
            }
            // InternalPaplj.g:5380:3: ( ruleQualifiedName )
            // InternalPaplj.g:5381:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeTypeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // InternalPaplj.g:5392:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5396:1: ( ( RULE_ID ) )
            // InternalPaplj.g:5397:2: ( RULE_ID )
            {
            // InternalPaplj.g:5397:2: ( RULE_ID )
            // InternalPaplj.g:5398:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Method__TypeAssignment_0"
    // InternalPaplj.g:5407:1: rule__Method__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5411:1: ( ( ( ruleQualifiedName ) ) )
            // InternalPaplj.g:5412:2: ( ( ruleQualifiedName ) )
            {
            // InternalPaplj.g:5412:2: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:5413:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getTypeTypeCrossReference_0_0()); 
            }
            // InternalPaplj.g:5414:3: ( ruleQualifiedName )
            // InternalPaplj.g:5415:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getTypeTypeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypeAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalPaplj.g:5426:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5430:1: ( ( RULE_ID ) )
            // InternalPaplj.g:5431:2: ( RULE_ID )
            {
            // InternalPaplj.g:5431:2: ( RULE_ID )
            // InternalPaplj.g:5432:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParamsAssignment_3_0"
    // InternalPaplj.g:5441:1: rule__Method__ParamsAssignment_3_0 : ( ruleParam ) ;
    public final void rule__Method__ParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5445:1: ( ( ruleParam ) )
            // InternalPaplj.g:5446:2: ( ruleParam )
            {
            // InternalPaplj.g:5446:2: ( ruleParam )
            // InternalPaplj.g:5447:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsParamParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsParamParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParamsAssignment_3_0"


    // $ANTLR start "rule__Method__ParamsAssignment_3_1_1"
    // InternalPaplj.g:5456:1: rule__Method__ParamsAssignment_3_1_1 : ( ruleParam ) ;
    public final void rule__Method__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5460:1: ( ( ruleParam ) )
            // InternalPaplj.g:5461:2: ( ruleParam )
            {
            // InternalPaplj.g:5461:2: ( ruleParam )
            // InternalPaplj.g:5462:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsParamParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsParamParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParamsAssignment_3_1_1"


    // $ANTLR start "rule__Method__BodyAssignment_5"
    // InternalPaplj.g:5471:1: rule__Method__BodyAssignment_5 : ( ruleBlock2 ) ;
    public final void rule__Method__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5475:1: ( ( ruleBlock2 ) )
            // InternalPaplj.g:5476:2: ( ruleBlock2 )
            {
            // InternalPaplj.g:5476:2: ( ruleBlock2 )
            // InternalPaplj.g:5477:3: ruleBlock2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getBodyBlock2ParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getBodyBlock2ParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__BodyAssignment_5"


    // $ANTLR start "rule__Param__TypeAssignment_0"
    // InternalPaplj.g:5486:1: rule__Param__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Param__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5490:1: ( ( ( ruleQualifiedName ) ) )
            // InternalPaplj.g:5491:2: ( ( ruleQualifiedName ) )
            {
            // InternalPaplj.g:5491:2: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:5492:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeTypeCrossReference_0_0()); 
            }
            // InternalPaplj.g:5493:3: ( ruleQualifiedName )
            // InternalPaplj.g:5494:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeTypeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__TypeAssignment_0"


    // $ANTLR start "rule__Param__NameAssignment_1"
    // InternalPaplj.g:5505:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5509:1: ( ( RULE_ID ) )
            // InternalPaplj.g:5510:2: ( RULE_ID )
            {
            // InternalPaplj.g:5510:2: ( RULE_ID )
            // InternalPaplj.g:5511:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__NameAssignment_1"


    // $ANTLR start "rule__Binding__TypeAssignment_0"
    // InternalPaplj.g:5520:1: rule__Binding__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Binding__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5524:1: ( ( ( ruleQualifiedName ) ) )
            // InternalPaplj.g:5525:2: ( ( ruleQualifiedName ) )
            {
            // InternalPaplj.g:5525:2: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:5526:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getTypeTypeCrossReference_0_0()); 
            }
            // InternalPaplj.g:5527:3: ( ruleQualifiedName )
            // InternalPaplj.g:5528:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getTypeTypeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__TypeAssignment_0"


    // $ANTLR start "rule__Binding__NameAssignment_1"
    // InternalPaplj.g:5539:1: rule__Binding__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Binding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5543:1: ( ( RULE_ID ) )
            // InternalPaplj.g:5544:2: ( RULE_ID )
            {
            // InternalPaplj.g:5544:2: ( RULE_ID )
            // InternalPaplj.g:5545:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__NameAssignment_1"


    // $ANTLR start "rule__Binding__ValueAssignment_3"
    // InternalPaplj.g:5554:1: rule__Binding__ValueAssignment_3 : ( ruleExpr ) ;
    public final void rule__Binding__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5558:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5559:2: ( ruleExpr )
            {
            // InternalPaplj.g:5559:2: ( ruleExpr )
            // InternalPaplj.g:5560:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getValueExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getValueExprParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ValueAssignment_3"


    // $ANTLR start "rule__Block2__ExprsAssignment_2_0"
    // InternalPaplj.g:5569:1: rule__Block2__ExprsAssignment_2_0 : ( ruleExpr ) ;
    public final void rule__Block2__ExprsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5573:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5574:2: ( ruleExpr )
            {
            // InternalPaplj.g:5574:2: ( ruleExpr )
            // InternalPaplj.g:5575:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getExprsExprParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getExprsExprParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__ExprsAssignment_2_0"


    // $ANTLR start "rule__Block2__ExprsAssignment_2_1_1"
    // InternalPaplj.g:5584:1: rule__Block2__ExprsAssignment_2_1_1 : ( ruleExpr ) ;
    public final void rule__Block2__ExprsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5588:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5589:2: ( ruleExpr )
            {
            // InternalPaplj.g:5589:2: ( ruleExpr )
            // InternalPaplj.g:5590:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlock2Access().getExprsExprParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlock2Access().getExprsExprParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block2__ExprsAssignment_2_1_1"


    // $ANTLR start "rule__AssignmentExpr__ValueAssignment_1_0_2"
    // InternalPaplj.g:5599:1: rule__AssignmentExpr__ValueAssignment_1_0_2 : ( ruleExpr ) ;
    public final void rule__AssignmentExpr__ValueAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5603:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5604:2: ( ruleExpr )
            {
            // InternalPaplj.g:5604:2: ( ruleExpr )
            // InternalPaplj.g:5605:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentExprAccess().getValueExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentExprAccess().getValueExprParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpr__ValueAssignment_1_0_2"


    // $ANTLR start "rule__LogicalOrExpr__RightAssignment_1_1"
    // InternalPaplj.g:5614:1: rule__LogicalOrExpr__RightAssignment_1_1 : ( ruleLogicalAndExpr ) ;
    public final void rule__LogicalOrExpr__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5618:1: ( ( ruleLogicalAndExpr ) )
            // InternalPaplj.g:5619:2: ( ruleLogicalAndExpr )
            {
            // InternalPaplj.g:5619:2: ( ruleLogicalAndExpr )
            // InternalPaplj.g:5620:3: ruleLogicalAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExprAccess().getRightLogicalAndExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicalAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExprAccess().getRightLogicalAndExprParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpr__RightAssignment_1_1"


    // $ANTLR start "rule__LogicalAndExpr__RightAssignment_1_1"
    // InternalPaplj.g:5629:1: rule__LogicalAndExpr__RightAssignment_1_1 : ( ruleComparativeExpr ) ;
    public final void rule__LogicalAndExpr__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5633:1: ( ( ruleComparativeExpr ) )
            // InternalPaplj.g:5634:2: ( ruleComparativeExpr )
            {
            // InternalPaplj.g:5634:2: ( ruleComparativeExpr )
            // InternalPaplj.g:5635:3: ruleComparativeExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExprAccess().getRightComparativeExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparativeExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExprAccess().getRightComparativeExprParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpr__RightAssignment_1_1"


    // $ANTLR start "rule__ComparativeExpr__RightAssignment_1_1"
    // InternalPaplj.g:5644:1: rule__ComparativeExpr__RightAssignment_1_1 : ( ruleAdditiveExpr ) ;
    public final void rule__ComparativeExpr__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5648:1: ( ( ruleAdditiveExpr ) )
            // InternalPaplj.g:5649:2: ( ruleAdditiveExpr )
            {
            // InternalPaplj.g:5649:2: ( ruleAdditiveExpr )
            // InternalPaplj.g:5650:3: ruleAdditiveExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparativeExprAccess().getRightAdditiveExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdditiveExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparativeExprAccess().getRightAdditiveExprParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpr__RightAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpr__RightAssignment_1_1"
    // InternalPaplj.g:5659:1: rule__AdditiveExpr__RightAssignment_1_1 : ( ruleMultiplicativeExpr ) ;
    public final void rule__AdditiveExpr__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5663:1: ( ( ruleMultiplicativeExpr ) )
            // InternalPaplj.g:5664:2: ( ruleMultiplicativeExpr )
            {
            // InternalPaplj.g:5664:2: ( ruleMultiplicativeExpr )
            // InternalPaplj.g:5665:3: ruleMultiplicativeExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExprAccess().getRightMultiplicativeExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExprAccess().getRightMultiplicativeExprParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpr__RightAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpr__RightAssignment_1_1"
    // InternalPaplj.g:5674:1: rule__MultiplicativeExpr__RightAssignment_1_1 : ( ruleUnaryExpr ) ;
    public final void rule__MultiplicativeExpr__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5678:1: ( ( ruleUnaryExpr ) )
            // InternalPaplj.g:5679:2: ( ruleUnaryExpr )
            {
            // InternalPaplj.g:5679:2: ( ruleUnaryExpr )
            // InternalPaplj.g:5680:3: ruleUnaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExprAccess().getRightUnaryExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExprAccess().getRightUnaryExprParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpr__RightAssignment_1_1"


    // $ANTLR start "rule__UnaryExpr__TypeAssignment_0_1_1"
    // InternalPaplj.g:5689:1: rule__UnaryExpr__TypeAssignment_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__UnaryExpr__TypeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5693:1: ( ( ( RULE_ID ) ) )
            // InternalPaplj.g:5694:2: ( ( RULE_ID ) )
            {
            // InternalPaplj.g:5694:2: ( ( RULE_ID ) )
            // InternalPaplj.g:5695:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getTypeTypeCrossReference_0_1_1_0()); 
            }
            // InternalPaplj.g:5696:3: ( RULE_ID )
            // InternalPaplj.g:5697:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getTypeTypeIDTerminalRuleCall_0_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getTypeTypeIDTerminalRuleCall_0_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getTypeTypeCrossReference_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__TypeAssignment_0_1_1"


    // $ANTLR start "rule__UnaryExpr__ExprAssignment_1_2"
    // InternalPaplj.g:5708:1: rule__UnaryExpr__ExprAssignment_1_2 : ( ruleUnaryExpr ) ;
    public final void rule__UnaryExpr__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5712:1: ( ( ruleUnaryExpr ) )
            // InternalPaplj.g:5713:2: ( ruleUnaryExpr )
            {
            // InternalPaplj.g:5713:2: ( ruleUnaryExpr )
            // InternalPaplj.g:5714:3: ruleUnaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__ExprAssignment_1_2"


    // $ANTLR start "rule__UnaryExpr__ExprAssignment_2_2"
    // InternalPaplj.g:5723:1: rule__UnaryExpr__ExprAssignment_2_2 : ( ruleUnaryExpr ) ;
    public final void rule__UnaryExpr__ExprAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5727:1: ( ( ruleUnaryExpr ) )
            // InternalPaplj.g:5728:2: ( ruleUnaryExpr )
            {
            // InternalPaplj.g:5728:2: ( ruleUnaryExpr )
            // InternalPaplj.g:5729:3: ruleUnaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__ExprAssignment_2_2"


    // $ANTLR start "rule__MemberExpr__MemberAssignment_1_0_2"
    // InternalPaplj.g:5738:1: rule__MemberExpr__MemberAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__MemberExpr__MemberAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5742:1: ( ( ( RULE_ID ) ) )
            // InternalPaplj.g:5743:2: ( ( RULE_ID ) )
            {
            // InternalPaplj.g:5743:2: ( ( RULE_ID ) )
            // InternalPaplj.g:5744:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getMemberMemberCrossReference_1_0_2_0()); 
            }
            // InternalPaplj.g:5745:3: ( RULE_ID )
            // InternalPaplj.g:5746:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getMemberMemberIDTerminalRuleCall_1_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getMemberMemberIDTerminalRuleCall_1_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getMemberMemberCrossReference_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__MemberAssignment_1_0_2"


    // $ANTLR start "rule__MemberExpr__MethodInvocationAssignment_1_0_3_0"
    // InternalPaplj.g:5757:1: rule__MemberExpr__MethodInvocationAssignment_1_0_3_0 : ( ( '(' ) ) ;
    public final void rule__MemberExpr__MethodInvocationAssignment_1_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5761:1: ( ( ( '(' ) ) )
            // InternalPaplj.g:5762:2: ( ( '(' ) )
            {
            // InternalPaplj.g:5762:2: ( ( '(' ) )
            // InternalPaplj.g:5763:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getMethodInvocationLeftParenthesisKeyword_1_0_3_0_0()); 
            }
            // InternalPaplj.g:5764:3: ( '(' )
            // InternalPaplj.g:5765:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getMethodInvocationLeftParenthesisKeyword_1_0_3_0_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getMethodInvocationLeftParenthesisKeyword_1_0_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getMethodInvocationLeftParenthesisKeyword_1_0_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__MethodInvocationAssignment_1_0_3_0"


    // $ANTLR start "rule__MemberExpr__ArgsAssignment_1_0_3_1_0"
    // InternalPaplj.g:5776:1: rule__MemberExpr__ArgsAssignment_1_0_3_1_0 : ( ruleExpr ) ;
    public final void rule__MemberExpr__ArgsAssignment_1_0_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5780:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5781:2: ( ruleExpr )
            {
            // InternalPaplj.g:5781:2: ( ruleExpr )
            // InternalPaplj.g:5782:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getArgsExprParserRuleCall_1_0_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getArgsExprParserRuleCall_1_0_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__ArgsAssignment_1_0_3_1_0"


    // $ANTLR start "rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1"
    // InternalPaplj.g:5791:1: rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1 : ( ruleExpr ) ;
    public final void rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5795:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5796:2: ( ruleExpr )
            {
            // InternalPaplj.g:5796:2: ( ruleExpr )
            // InternalPaplj.g:5797:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberExprAccess().getArgsExprParserRuleCall_1_0_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberExprAccess().getArgsExprParserRuleCall_1_0_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberExpr__ArgsAssignment_1_0_3_1_1_1"


    // $ANTLR start "rule__PrimaryExpr__ValueAssignment_0_1"
    // InternalPaplj.g:5806:1: rule__PrimaryExpr__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__PrimaryExpr__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5810:1: ( ( RULE_INT ) )
            // InternalPaplj.g:5811:2: ( RULE_INT )
            {
            // InternalPaplj.g:5811:2: ( RULE_INT )
            // InternalPaplj.g:5812:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__ValueAssignment_0_1"


    // $ANTLR start "rule__PrimaryExpr__TrueAssignment_1_1_0"
    // InternalPaplj.g:5821:1: rule__PrimaryExpr__TrueAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__PrimaryExpr__TrueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5825:1: ( ( ( 'true' ) ) )
            // InternalPaplj.g:5826:2: ( ( 'true' ) )
            {
            // InternalPaplj.g:5826:2: ( ( 'true' ) )
            // InternalPaplj.g:5827:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getTrueTrueKeyword_1_1_0_0()); 
            }
            // InternalPaplj.g:5828:3: ( 'true' )
            // InternalPaplj.g:5829:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getTrueTrueKeyword_1_1_0_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getTrueTrueKeyword_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getTrueTrueKeyword_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__TrueAssignment_1_1_0"


    // $ANTLR start "rule__PrimaryExpr__TypeAssignment_3_2"
    // InternalPaplj.g:5840:1: rule__PrimaryExpr__TypeAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpr__TypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5844:1: ( ( ( RULE_ID ) ) )
            // InternalPaplj.g:5845:2: ( ( RULE_ID ) )
            {
            // InternalPaplj.g:5845:2: ( ( RULE_ID ) )
            // InternalPaplj.g:5846:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getTypeTypeCrossReference_3_2_0()); 
            }
            // InternalPaplj.g:5847:3: ( RULE_ID )
            // InternalPaplj.g:5848:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getTypeTypeIDTerminalRuleCall_3_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getTypeTypeIDTerminalRuleCall_3_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getTypeTypeCrossReference_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__TypeAssignment_3_2"


    // $ANTLR start "rule__PrimaryExpr__TypeAssignment_4_2"
    // InternalPaplj.g:5859:1: rule__PrimaryExpr__TypeAssignment_4_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PrimaryExpr__TypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5863:1: ( ( ( ruleQualifiedName ) ) )
            // InternalPaplj.g:5864:2: ( ( ruleQualifiedName ) )
            {
            // InternalPaplj.g:5864:2: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:5865:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getTypeTypeCrossReference_4_2_0()); 
            }
            // InternalPaplj.g:5866:3: ( ruleQualifiedName )
            // InternalPaplj.g:5867:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getTypeTypeQualifiedNameParserRuleCall_4_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getTypeTypeQualifiedNameParserRuleCall_4_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getTypeTypeCrossReference_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__TypeAssignment_4_2"


    // $ANTLR start "rule__PrimaryExpr__MemberAssignment_5_1"
    // InternalPaplj.g:5878:1: rule__PrimaryExpr__MemberAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpr__MemberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5882:1: ( ( ( RULE_ID ) ) )
            // InternalPaplj.g:5883:2: ( ( RULE_ID ) )
            {
            // InternalPaplj.g:5883:2: ( ( RULE_ID ) )
            // InternalPaplj.g:5884:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getMemberSymbolCrossReference_5_1_0()); 
            }
            // InternalPaplj.g:5885:3: ( RULE_ID )
            // InternalPaplj.g:5886:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getMemberSymbolIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getMemberSymbolIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getMemberSymbolCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__MemberAssignment_5_1"


    // $ANTLR start "rule__PrimaryExpr__MethodInvocationAssignment_5_2_0"
    // InternalPaplj.g:5897:1: rule__PrimaryExpr__MethodInvocationAssignment_5_2_0 : ( ( '(' ) ) ;
    public final void rule__PrimaryExpr__MethodInvocationAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5901:1: ( ( ( '(' ) ) )
            // InternalPaplj.g:5902:2: ( ( '(' ) )
            {
            // InternalPaplj.g:5902:2: ( ( '(' ) )
            // InternalPaplj.g:5903:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getMethodInvocationLeftParenthesisKeyword_5_2_0_0()); 
            }
            // InternalPaplj.g:5904:3: ( '(' )
            // InternalPaplj.g:5905:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getMethodInvocationLeftParenthesisKeyword_5_2_0_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getMethodInvocationLeftParenthesisKeyword_5_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getMethodInvocationLeftParenthesisKeyword_5_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__MethodInvocationAssignment_5_2_0"


    // $ANTLR start "rule__PrimaryExpr__ArgsAssignment_5_2_1_0"
    // InternalPaplj.g:5916:1: rule__PrimaryExpr__ArgsAssignment_5_2_1_0 : ( ruleExpr ) ;
    public final void rule__PrimaryExpr__ArgsAssignment_5_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5920:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5921:2: ( ruleExpr )
            {
            // InternalPaplj.g:5921:2: ( ruleExpr )
            // InternalPaplj.g:5922:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getArgsExprParserRuleCall_5_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getArgsExprParserRuleCall_5_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__ArgsAssignment_5_2_1_0"


    // $ANTLR start "rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1"
    // InternalPaplj.g:5931:1: rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1 : ( ruleExpr ) ;
    public final void rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5935:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5936:2: ( ruleExpr )
            {
            // InternalPaplj.g:5936:2: ( ruleExpr )
            // InternalPaplj.g:5937:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getArgsExprParserRuleCall_5_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getArgsExprParserRuleCall_5_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__ArgsAssignment_5_2_1_1_1"


    // $ANTLR start "rule__If__ConditionAssignment_2"
    // InternalPaplj.g:5946:1: rule__If__ConditionAssignment_2 : ( ruleExpr ) ;
    public final void rule__If__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5950:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5951:2: ( ruleExpr )
            {
            // InternalPaplj.g:5951:2: ( ruleExpr )
            // InternalPaplj.g:5952:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionAssignment_2"


    // $ANTLR start "rule__If__OnTrueAssignment_4"
    // InternalPaplj.g:5961:1: rule__If__OnTrueAssignment_4 : ( ruleExpr ) ;
    public final void rule__If__OnTrueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5965:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5966:2: ( ruleExpr )
            {
            // InternalPaplj.g:5966:2: ( ruleExpr )
            // InternalPaplj.g:5967:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getOnTrueExprParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getOnTrueExprParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__OnTrueAssignment_4"


    // $ANTLR start "rule__If__OnFalseAssignment_6"
    // InternalPaplj.g:5976:1: rule__If__OnFalseAssignment_6 : ( ruleExpr ) ;
    public final void rule__If__OnFalseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5980:1: ( ( ruleExpr ) )
            // InternalPaplj.g:5981:2: ( ruleExpr )
            {
            // InternalPaplj.g:5981:2: ( ruleExpr )
            // InternalPaplj.g:5982:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getOnFalseExprParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getOnFalseExprParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__OnFalseAssignment_6"


    // $ANTLR start "rule__Let__BindingsAssignment_1"
    // InternalPaplj.g:5991:1: rule__Let__BindingsAssignment_1 : ( ruleBinding ) ;
    public final void rule__Let__BindingsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:5995:1: ( ( ruleBinding ) )
            // InternalPaplj.g:5996:2: ( ruleBinding )
            {
            // InternalPaplj.g:5996:2: ( ruleBinding )
            // InternalPaplj.g:5997:3: ruleBinding
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetAccess().getBindingsBindingParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetAccess().getBindingsBindingParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__BindingsAssignment_1"


    // $ANTLR start "rule__Let__ExprAssignment_3"
    // InternalPaplj.g:6006:1: rule__Let__ExprAssignment_3 : ( ruleExpr ) ;
    public final void rule__Let__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPaplj.g:6010:1: ( ( ruleExpr ) )
            // InternalPaplj.g:6011:2: ( ruleExpr )
            {
            // InternalPaplj.g:6011:2: ( ruleExpr )
            // InternalPaplj.g:6012:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetAccess().getExprExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetAccess().getExprExprParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__ExprAssignment_3"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\3\uffff\1\6\3\uffff";
    static final String dfa_3s = "\5\4\2\uffff";
    static final String dfa_4s = "\1\4\1\17\1\4\1\26\1\17\2\uffff";
    static final String dfa_5s = "\5\uffff\1\2\1\1";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\3\12\uffff\1\2",
            "\1\4",
            "\1\6\10\uffff\1\6\6\uffff\1\6\1\uffff\1\5",
            "\1\3\12\uffff\1\2",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "653:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleMethod ) );";
        }
    }
    static final String dfa_8s = "\1\2\1\3\4\uffff\1\3";
    static final String dfa_9s = "\2\4\2\uffff\3\4";
    static final String dfa_10s = "\2\53\2\uffff\1\4\1\31\1\53";
    static final String dfa_11s = "\2\uffff\1\2\1\1\3\uffff";
    static final String[] dfa_12s = {
            "\1\1\10\uffff\1\2\1\uffff\1\2\4\uffff\1\2\2\uffff\15\2\5\uffff\1\2\1\uffff\1\2",
            "\1\5\10\uffff\1\3\1\uffff\1\4\4\uffff\1\3\2\uffff\15\3\5\uffff\1\3\1\uffff\1\3",
            "",
            "",
            "\1\6",
            "\1\3\12\uffff\1\3\11\uffff\1\2",
            "\1\5\10\uffff\1\3\1\uffff\1\4\4\uffff\1\3\1\uffff\16\3\5\uffff\1\3\1\uffff\1\3"
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "4457:2: ( rule__PrimaryExpr__TypeAssignment_3_2 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000015F100480830L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000015F100582830L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000015F100C80830L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000010L});

}