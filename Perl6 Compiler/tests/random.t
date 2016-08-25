use v6;

my $a = 5;

{
	my $a = 6;
	say $a;
};

say $a;